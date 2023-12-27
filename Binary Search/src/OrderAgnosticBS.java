public class OrderAgnosticBS {
    public static void main(String[] args) {

       // int[] arr = {-98, -67, -54, -32, -12, -3, 0, 4, 56, 123, 345, 1234};
        int[] arr = {1234, 567, 234, 97, 76, 43, 21, 12, 0, -12, -23, -23, -89, -456};
        int target = 76;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {

        // initialization.
        int start = 0;
        int end = arr.length - 1;

        // check whether the given sorted array is ascending or descending.
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
