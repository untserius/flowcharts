import java.util.Arrays;

public class QSwap {
    public static void main(String[] args) {

        // Q. Swap two numbers in an array.
        int[] arr = {1, 2, 3, 4, 5};

        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
