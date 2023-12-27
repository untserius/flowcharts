public class Ceiling {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 12, 23, 34};
        //int[] arr = {54, 23, 12, 1, 0, -4};
        int target = 22;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }

                if (target > arr[mid]) {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }

                if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return start;
    }
}
