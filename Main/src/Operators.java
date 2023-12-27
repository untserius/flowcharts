import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter another number: ");
        int b = input.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a/b;

        System.out.println("The addition of two numbers is " + add);
        System.out.println("The subtraction of two numbers is " + sub);
        System.out.println("The multiplication of two numbers is " + mul);
        System.out.println("The division of two numbers is " + div);

    }
}
