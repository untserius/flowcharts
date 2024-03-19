import java.util.Arrays;

public class BubbleSort_Striver {
    public static int[] bubblesort(int[] arr, int n){
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {13, 52, 24, 46, 20, 9};
        int n = arr.length;

        System.out.println(Arrays.toString(bubblesort(arr, n)));
    }
}
