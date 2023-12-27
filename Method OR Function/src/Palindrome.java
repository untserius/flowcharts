import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = in.nextInt(); // 123321
        boolean ans = check(a);
        System.out.println(ans);
    }

    static boolean check(int a) {
        int original = a;
        int sum = 0;

        while (a > 0) {
            int rem = a%10;
            a = a/10;
            sum = sum*10 + rem;
        }
        if (original == sum) return true;
        else return false;
    }
}
