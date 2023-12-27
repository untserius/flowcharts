import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = input.nextInt();

        System.out.println("Please enter another number: ");
        int b = input.nextInt();

        if (a>b){
            System.out.println(a + " is the largest number");
        }
        else {
            System.out.println(b + " is the largest number");
        }

    }
}
