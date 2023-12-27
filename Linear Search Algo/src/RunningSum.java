import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sum(num)));
    }

    static int[] sum(int[] sum) {

        int[] result = new int[sum.length];

        result [0] = sum[0];
        for (int i = 1; i<sum.length; i++) {

            result[i] = result[i-1] + sum[i];
        }
        return result;
    }
}
