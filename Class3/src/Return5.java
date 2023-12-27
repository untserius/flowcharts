import java.util.Scanner;

public class Return5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String x = in.next();

        String start = greet(x);
        System.out.println(start);
    }

    static String greet(String entry) {
        String message = "Hello " + entry;
        return message;

    }
}
