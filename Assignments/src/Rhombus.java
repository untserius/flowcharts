import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the vale of two diagonals: ");

        int a = in.nextInt();
        int b = in.nextInt();

        double area = (0.5 * (a * b));

        System.out.println(area);
    }
}
