import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// 2.2 Area of triangle.
        System.out.println("Please enter your breadth & height: ");
        float b = input.nextFloat();
        float h = input.nextFloat();
        double area = (0.5 * b * h);

        System.out.println("The area of the triangle is " + area);
    }
}
