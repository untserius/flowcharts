import java.util.Scanner;

public class Important {
    public static void main(String[] args) {
//        System.out.println("Enter your age");
//
//        Scanner in = new Scanner(System.in);
//
//        int age = in.nextInt();
//        if (age >= 18) {
//            System.out.println("Congratulations! You are eligible for voting.");
//        } else {
//            System.out.println("You are not eligibile. Please try agin later.");
//        }
//

//   Prime No.

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int a = in.nextInt();

        int i = 1; // initialization
        int count = 0; // to check how many times it gives remainder (%) 0
        while (i <= a) {  // to check conditions of the given input a.
            if (a%i == 0) { // to check remainder.
                count++; // to count how many time the remainder hits 0.
            }
            i++; // it increases the value +1 until it hits "a".
        } if (count == 2) { // Prime no. should hit 2 times, by 1 & by itself. Thus it should be set to "2".
            System.out.println(a + " is a prime number.");
        } else
            System.out.println(a + " is not a prime number.");

    }
}
