import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {12, 22, 44},
                {23, 33, 789}
        };

        int target = 22;
        int[] ans = search2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
