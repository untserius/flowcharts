import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        // A2.1 - Area of the circle.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your radius: ");

        int r = input.nextInt();
        double area = (3.14 * (r*r));

        System.out.println("Area of the circle is: " + area);

    }
}