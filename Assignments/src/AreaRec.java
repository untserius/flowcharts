import java.util.Scanner;

public class AreaRec {
    public static void main(String[] args) {
        System.out.println("Enter your length and height: ");
        Scanner in = new Scanner(System.in);

        float l = in.nextFloat();
        float h = in.nextFloat();
        double area = (l * h);

        System.out.println("Thus, the area of the rectangle is " + area);
    }
}
