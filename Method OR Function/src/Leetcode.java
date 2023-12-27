import java.util.Scanner;

public class Leetcode {
    //Q. Subtract the product and sum of the digits of a number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         int ans = Leet(n);
        System.out.println(ans);
    }

    static int Leet(int n) {

        int var1 = 0;
        int var2 = 1;
        int sum = 0;
        int mul = 0;
        int total = 0;
        while (n > 0) {

            int rem = n % 10;
            n = n / 10;

            var1 = var1 + rem;
            sum = var1;

            var2 = var2 * rem;
            mul = var2;

            total = var1 - var2;
        }

        return total;
    }
}
