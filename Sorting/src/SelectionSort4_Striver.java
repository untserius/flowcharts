import java.util.Arrays;

public class SelectionSort4_Striver {
    public static int[] ss(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimum]){
                    minimum = j;
                }
            }

            // Swap
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 87, 64, 42, 10};

        System.out.println(Arrays.toString(ss(arr)));
    }
}
