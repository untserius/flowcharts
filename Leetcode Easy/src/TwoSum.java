import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(twosum(arr, 6)));
    }

    static int[] twosum(int[] arr, int target) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[j] + arr[i];
                if (sum == target) {
                    return new int[] {i, j}; // new int[] - because we have to show result in array form.
                }
            }
        }
        return null;
    }
}