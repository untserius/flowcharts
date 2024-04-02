import java.util.Scanner;

public class StringExplain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        if (checker(x)) {
            System.out.println(x + " is a Palindrome");
        }
    }

    public static boolean checker(String jeet) {

        if (jeet == null || jeet.isEmpty()) {
            return false;
        }

        int lastIndex = jeet.length() - 1;

        for (int i = 0; i <= lastIndex; i++) {
            int left = jeet.charAt(i);
            int right = jeet.charAt(lastIndex - i);

            if (left != right) {
                return false;
            }
        }
        return true;
    }


}
