public class CountRotation {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int pivot = findPivot(arr);
        int rotation = pivot + 1;
        System.out.println("The array is rotated " + rotation + " times.");
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
