import java.util.Scanner;

public class Currency {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Assignment 5
        System.out.println("Enter your currency amount in Rupees: ");

        float r = input.nextFloat();
        float u = (r * 0.012f);

        System.out.println("In USD: "+ u);
    }
}
