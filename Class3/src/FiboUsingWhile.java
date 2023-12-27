import java.util.Scanner;

public class FiboUsingWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        int i = 1;
        while (i<=n) {
            i += 1;
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
