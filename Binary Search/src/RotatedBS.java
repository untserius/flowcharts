public class RotatedBS {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 0, 1, 2, 3, 4};
        int target = 6;
        System.out.println(findPivot(arr));

    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);


        // if you do not find the pivot, it means the array is not sorted.
        if (pivot == -1) {
            // just do normal binary search.
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is there, you know there is 2 ascending sorted array.
        /*CASE 1*/ if (arr[pivot] == target) {
            return pivot;
        }

        /*CASE 2*/ if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        /*CASE 3*/ return binarySearch(arr, target, pivot + 1, arr.length -1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // CASE 1- when mid element > mid + 1 element.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // CASE 2- when mid element < mid - 1 element.
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // CASE 3- mid element < start element.
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            // CASE 4 = mid element > start element. It should've been returned in the case 1 & 2.
            // As the possibility of more bigger are ahead of the mid element, we need to seach in the right side of the mid element.
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
        }
        return -1; // if element not found.
    }
}
// Explanation in the https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/10-binary%20search/Binary%20Search%20-%20Questions.pdf