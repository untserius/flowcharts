public class QMaxRange {
    public static void main(String[] args) {

        int[] arr2 = {1, 2, 45, 23, 24, 123};
        int ans = maxRange(arr2, 2, 5);
        System.out.println(ans);
    }

    static int maxRange(int[] arr, int start, int end) {

        // ---------------Test for edge cases. (Basically it means exceptions.)----------------------
        if (end > start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        // ----------------------edge cases ends here--------------------------

        int maxVal = 0;
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
