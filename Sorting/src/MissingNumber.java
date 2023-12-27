import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {0, 3, 2, 1};
        System.out.println(cyclic(arr));
    }

    static int cyclic(int[] arr) {
        int i = 0;
        while (i <= arr.length -1) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // now search for 1st missing index.
        // case 1
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
