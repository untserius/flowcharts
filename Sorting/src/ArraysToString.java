import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        int[][] str = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] str2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.deepToString(str));

        System.out.println(str2);
    }
}
