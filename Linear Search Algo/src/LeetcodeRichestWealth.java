import com.sun.jdi.Value;

public class LeetcodeRichestWealth {
    public static void main(String[] args) {

        int[][] bank = {
                {1, 1, 1},
                {1, 2, 1},
                {1, 2, 3}

        };

        System.out.println(richest(bank));
    }

    static int richest(int[][] accounts) {

        int maxAmount = Integer.MIN_VALUE;
        for (int[] account : accounts) {

            int initial = 0;
            for (int amount : account) {
                initial = initial + amount;
            }

            if (initial > maxAmount) {
                maxAmount = initial;
            }
        }
        return maxAmount;
    }
}
