import java.util.Scanner;

public class PrimeUsingFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) { // or (i*i <= n) Instead of checking till n, we can check till √n because a larger factor of n must be a multiple of smaller factor that has been already checked.
            if (n % i == 0) {
                return false;
            }
            i++;
        }
            if (i >= Math.sqrt(2)) {
                return true;
        }
            return false;
    }
}
