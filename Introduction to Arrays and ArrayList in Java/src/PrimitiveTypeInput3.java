import java.util.Arrays;
import java.util.Scanner;

public class PrimitiveTypeInput3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] hi = new int[3];

        for (int i = 0; i<hi.length; i++) {
            hi[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(hi));
    }
}
