import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Operations will continue until the user press 'x' or 'X'.
        int ans = 0;
        while (true) {
            // Enter the operator.
            System.out.println("Enter the operator: ");
            char ch = input.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {

                // Input two numbers.
                System.out.println("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (ch == '+') {
                    ans = num1 + num2;
                }
                if (ch == '-') {
                    ans = num1 - num2;
                }
                if (ch == '*') {
                    ans = num1 * num2;
                }
                if (ch == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (ch == '%') {
                    ans = num1 % num2;
                }
            }
            else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation.");
            }
            System.out.println(ans);
        }
    }
}


