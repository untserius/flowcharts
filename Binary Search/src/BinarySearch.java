public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-123, -89, -24, -13, -2, 0, 3, 6, 23, 54, 567, 1244};
        int target = 1244;
        System.out.println("The requested target is found at Index No: " + binarySearch(arr, target));
    }

    // return the target.
    // else return -1, if not found.
    static int binarySearch(int[] arr, int target) {

        // Initialization.
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else
                return mid;
        }
        return -1;
    }
}