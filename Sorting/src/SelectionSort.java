import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {-3, -10, 0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Step 1.
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the largest element and swap to its correct index.
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    // Step 3.
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Step 2.
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
