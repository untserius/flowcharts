public class QMaxValue {
    public static void main(String[] args) {

 // Q. Print the max value of the given array.

        int[] arr = {1, 2, 45, 77, 23};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {

        // Edge case.
         if (arr.length == 0) {
             return -1;
         }
         // -------------------------------------------------------

        int maxVal = arr[0];
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
