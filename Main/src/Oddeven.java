import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
// Assignment no. 1

        int a = input.nextInt();
        if (a%2 == 0) {
            System.out.println(a + " is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }

    }
}
