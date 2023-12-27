import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        System.out.print("Enter your numbers: ");

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
/*
        int mx = a;
        if (b > mx) {
            mx = b;
        }
        if (c > mx) {
            mx = c;
        }
        System.out.println(mx);
*/
        // Second method
        int mx = Math.max(c, (Math.max(a, b)));
        System.out.println(mx);

    }
}
