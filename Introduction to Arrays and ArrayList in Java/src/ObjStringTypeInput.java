import java.util.Arrays;
import java.util.Scanner;

public class ObjStringTypeInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] hello = new String[5];

        for (int i = 0; i < hello.length; i++) {
            hello[i] = in.next();
        }

        System.out.println(Arrays.toString(hello));

    }
}
