import java.util.Scanner;

public class Armstrong {
    // Q. Check if "n" is an armstrong number.
    // Armstrong No. 153 (Sum of (1)^3 + (5)^3 + (3)^3 = 153)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));

    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original) {
            return true;
        }
        return false;

    }
}
