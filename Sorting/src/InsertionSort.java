import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {4, 5, 3, 2, 1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
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

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// I can do this.