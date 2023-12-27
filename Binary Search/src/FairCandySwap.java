import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {

        int[] a = {20,35,22,6,13};
        int[] b = {31,57};

        System.out.println(Arrays.toString(fairCandySwap(a, b)));

    }

    /*
    ********************** INTUITION BEHIND IT ***************************

    Total no. of candies Alice has = suma
    Total no. of candies Bob has = sumb

    IF ALICE GIVES X CANDIES AND RECEIVES Y CANDIES.
    ALSO BOB HAS TO GIVE Y CANDIES AND RECEIVES X CANDIES.

    Eventually both of them must have equal no. of candies.

    suma - x + y = sumb - y + x
    x - y = (suma - sumb) / 2
    or x - y = diff (as diff = (suma - sumb) / 2)

    then B.S for x = y + diff in the Alice array.
    or a[i] = b[i] + diff;
    & return {b[i], b[i] + diff};
     */

    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int suma = 0;
        int sumb = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            suma = suma + aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sumb = sumb + bobSizes[i];
        }

        int diff = (suma - sumb)/2;

        insertion(aliceSizes);
        for (int i = 0; i < bobSizes.length; i++) {
            if (binarySearch(aliceSizes, bobSizes[i] + diff) != -1) return new int[]{bobSizes[i] + diff, bobSizes[i]};
        }
        return null;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static void insertion(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) { // why arr.length -2 ? becuz j will not go index out of bound. more details check out the video.
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break; // there is no need check further left.
                }
            }
        }
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
