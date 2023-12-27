public class GuessHigherORLower {
    public static void main(String[] args) {

    }
    static int guessNumber(int n) {

        int start = 1; // given in question start from 1.
        int end = n - 1; // upto n.

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guessNumber(mid) == 0) {
                return mid;
            } else if (guessNumber(mid) == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return n;
    }
}
