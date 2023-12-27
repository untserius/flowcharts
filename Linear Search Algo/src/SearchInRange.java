public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {1, 2, 34, 55, 77, 890};
        int target = 34;
        System.out.println(searchRange(arr, 3, 5, target));
    }

    static int searchRange(int[] arr, int start, int end, int target) {


            if (arr.length == 0) {
                return -1;
            }

            for (int i = start; i <= end; i++) {
                int element = arr[i];
                if (element == target) {
                    return i;
                }
            }
        return -1;
    }
}
