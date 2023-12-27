public class CheckIfExist {
    public static void main(String[] args) {

        int[] arr = {10, 2, 5, 3};
        System.out.println(checkIfExist(arr));
    }

    /*
        i != j
        0 <= i, j < arr.length
        arr[i] == 2 * arr[j]
     */

    /*

    static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

     */
    static boolean checkIfExist(int[] arr) {

        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {

            int target = 2 * arr[i];

            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target && mid != i) {
                    return true;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        // run the steps n-1 times.
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at last respective index.
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous one.
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // if you did not swap for a particular value of i, it means array is sorted. Hence, break.
            if (!swapped) {
                break;
            }
        }
    }

}
