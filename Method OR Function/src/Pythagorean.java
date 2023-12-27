import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean ans = check(a, b, c);
        System.out.println(ans);

    }

    static boolean check(int a, int b, int c) {

        int temp = (a * a) + (b * b);

        if (temp == c * c) {
            return true;
        }
        return false;
    }
}
