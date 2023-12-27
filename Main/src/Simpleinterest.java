import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Assignment no. 3
        System.out.println("Please enter your principal amount: ");
        int p = input.nextInt();
        System.out.println("Please enter your rate of interest: ");
        int r = input.nextInt();
        System.out.println("Please enter your time (in no. of years) : ");
        int t = input.nextInt();

        int TA = p*(1 + ((r/100)*t));
        System.out.println("Your Total amount for the given parameters is " + TA);
    }
}
