import java.util.Arrays;

public class InsertionSort_Striver {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 23, 12, 21, 67};
        int n = arr.length;

        System.out.println(Arrays.toString(sort(arr, n)));
    }

    public static int[] sort(int[] arr, int n) {
        // Take an element place it in its correct order
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
