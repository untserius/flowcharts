import java.util.Arrays;
import java.util.Scanner;

public class Another2Darray {
    public static void main(String[] args) {

        // Q. Print a 4x4 2D array.

        // int[][] arr2 = {[1, 2, 3, 4],  [5, 6, 7, 8],  [9, 10, 11, 12],  [13, 14, 15, 16]};
        //                     0th              1st            2nd               3rd
        Scanner in = new Scanner(System.in);
        int[][] arr2 = new int[4][4];

        // input
        for (int row = 0; row < arr2.length; row++) {

            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = in.nextInt();
            }
        }

        // output
// 1.

//        for (int row = 0; row < arr2.length; row++) {
//
//            System.out.println(Arrays.toString(arr2[row]));
//        }

// 2.
        for (int[] num : arr2) {
            System.out.println(Arrays.toString(num));
        }
    }
}
