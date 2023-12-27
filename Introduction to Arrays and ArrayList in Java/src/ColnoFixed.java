public class ColnoFixed {
    public static void main(String[] args) {

        int[][] arr3 = {
                {1, 2, 3, 4},
                {2, 3},
                {4, 6, 7}
        };

        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();

        }
    }
}
