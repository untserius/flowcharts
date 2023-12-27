public class FindMax {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 67, 778, -7};

        System.out.println(searchMax(arr));
    }
    static int searchMax(int[] arr) {

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            if (element > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
