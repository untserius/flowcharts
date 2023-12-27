public class FindMin {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 55, 23, -4, 10, -7, 28};

        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr) {

        int ans = arr[0]; // Lets assume the 0th element is the minimum value intially.
        int i = 1; // starting from 1st index.
        while (i < arr.length) {
            int element = arr[i];
            if (arr[i] < ans) {
                ans = arr[i];
            }
            i++;
        }
        return ans;
    }
}
