public class QReturnIndex {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 55, 778, 12, 34};
        int target = 2;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found.
    // otherwise return -1, if item not found.
    static int linearSearch (int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
            // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element in every index that if it is = target.
            //
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the above statements are not found.
        // hence item not found
        return -1;
    }
}
