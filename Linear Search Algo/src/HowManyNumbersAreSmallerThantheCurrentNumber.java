import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 6, 2};
        System.out.println(Arrays.toString(smallernum(arr)));
    }

    static int[] smallernum(int[] arr) {

        int[] ans = new int[arr.length];

        for (int i =0; i < arr.length; i++) {

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] < arr[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
