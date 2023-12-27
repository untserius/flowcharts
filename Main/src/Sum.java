import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int No1 = input.nextInt();
        System.out.println("Enter another number ");
        int No2 = input.nextInt();
        int sum = No1 + No2;

        System.out.println("The sum of these two numbers are " + sum);


    }
}
