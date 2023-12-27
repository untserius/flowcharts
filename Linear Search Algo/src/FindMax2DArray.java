import java.util.Arrays;

public class FindMax2DArray {
    public static void main(String[] args) {

        int[][] arr = { {1, 2, 3, 4},
                        {5, 7, 8, 0},
                        {12, 45, 90}
        };
        int ans = findMax(arr);
        System.out.println(ans);
    }

    static int findMax(int[][] arr) {

        int maxValue = Integer.MIN_VALUE; // or you can write 0.
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
             if (arr[row][col] > maxValue) {
                 maxValue = arr[row][col];
                }
            }
        }
        return maxValue;
    }
}
