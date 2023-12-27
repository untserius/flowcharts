import java.util.Arrays;

public class RowColMatrix2DArray {
    public static void main(String[] args) {

// EXPLANATION - https://youtu.be/enI_KyGLYPo @ 05:00

        int[][] arr = {
                {10, 20, 30, 40},
                {11, 21, 32, 44},
                {22, 43, 54, 60},
                {33, 47, 59, 65},
        };

        System.out.println(Arrays.toString(search(arr, 60)));

    }

    static int[] search(int[][] matrix, int target) {

        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
             col--;
            }
        }
        return new int[]{-1, -1};
    }
}
