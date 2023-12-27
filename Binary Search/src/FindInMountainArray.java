public class FindInMountainArray {
    public static void main(String[] args) {

        // https://leetcode.com/problems/find-in-mountain-array/
        // This question = Combination of Peak Index & Order agnostic binary search

    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // search for the second half.
        return orderAgnosticBS(arr, target, peak, arr.length - 1);
    }
    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are int the decreasing part of the array.
                // as mid may be the possible ans, look at left.
                // thats why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of the array.
                start = mid + 1;
            }
        }
        // in the end, start == end, pointing to the largest element of the array because of the 2 checks above.
        // start and end are always finding the max element in the array, hence the last element left is the max one.
        // because thats what the 2 above checks says.
        return start; // or return end.
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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
