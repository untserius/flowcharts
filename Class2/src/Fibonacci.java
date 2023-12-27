import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int n = input.nextInt();

        if (n == 0){
            System.out.println(a);
        }
        else if (n == 1) {
            System.out.println(a +" "+ b);
        }
        else
            for (int i = 1; i<=n; i++);
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c + " ");
    }
}
