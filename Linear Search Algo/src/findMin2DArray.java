public class findMin2DArray {
    public static void main(String[] args) {

        int [][] arr2 = {
                {9, 8, 56},
                {4, 56, 123, 4},
                {12, 78, -45, 34}
        };

        int ans = findMin(arr2);
        System.out.println(ans);
    }

    static int findMin(int[][] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < minValue) {
                    minValue = arr[row][col];
                }
            }
        }
        return minValue;
    }
}
