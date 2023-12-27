import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int r = in.nextInt();
        System.out.println("Enter height: ");
        int h = in.nextInt();

        double area = 3.14 * r * (r + Math.sqrt((h*h) + (r*r)));
        System.out.println("The area of the Cone is " + area);


    }
}
