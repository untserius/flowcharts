public class KthMissingNumber {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
    }
    static int findKthPositive(int[] arr, int k) {

        int start = 0;
        int end = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int missingnums = arr[mid] - (mid + 1);

            if (arr[0] > k) {
                return k;
            }

            if (missingnums < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        start--;
        int missingnums = arr[start] - (start + 1);
        return arr[start] + (k - missingnums);
    }
}
