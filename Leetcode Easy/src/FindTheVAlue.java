import java.util.Arrays;
import java.util.Scanner;

public class FindTheVAlue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = in.nextInt();

        int[] arr = {1, 2, 4, 5, 88, 45};

        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == n) {
                int[] ans = {i};
                System.out.println(Arrays.toString(ans));
            }
        }
    }
}
