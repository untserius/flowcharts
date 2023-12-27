import java.util.Scanner;

public class PrimitiveTypeInput2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] bye = new int[6];

        for (int i = 0; i < bye.length; i++) {
            bye[i] = in.nextInt();
        }

        for (int num : bye) { // for every element in the array, print the element.
            System.out.print(num+" "); // here num represents the elements of array.
        }                               // known as for each loop
    }
}
