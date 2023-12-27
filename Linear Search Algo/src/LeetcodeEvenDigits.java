public class LeetcodeEvenDigits {
    public static void main(String[] args) {

        int[] arr = {-1345, 2123, 334, 42};
        System.out.println(findNum(arr));
    }

    static int findNum(int[] arr) {

        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // to check if the num is even.
    static boolean even(int num) {
        int noofdigits = digits(num);

        return noofdigits % 2 == 0;
    }

    // to check the number of digits.
    static int digits(int num) {
        int count = 0;

        if(num < 0) {
            num = num * -1;
        }

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}

