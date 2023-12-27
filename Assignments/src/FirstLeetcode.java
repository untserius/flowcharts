import java.util.Scanner;

public class FirstLeetcode {
    public static void main(String[] args) {

        // Give the factorials of x.

        int x = 4;

        for (int i = 1; i<=20; i+= 1) {

            if (x % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}