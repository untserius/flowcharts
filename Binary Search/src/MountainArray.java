import java.util.Arrays;

public class MountainArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 4, 2, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are int the decreasing part of the array.
                // as mid may be the possible ans, look at left.
                // thats why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of the array.
                start = mid + 1;
            }
        }
        // in the end, start == end, pointing to the largest element of the array because of the 2 checks above.
        // start and end are always finding the max element in the array, hence the last element left is the max one.
        // because thats what the 2 above checks says.
        return start; // or return end.
    }
}
