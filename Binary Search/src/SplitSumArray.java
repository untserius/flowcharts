public class SplitSumArray {
    public static void main(String[] args) {


        int[] nums = {7, 2, 5, 8, 10};
        int ans = splitArray(nums, 2);
        System.out.println(ans);
    }

    static int splitArray(int[] nums, int k) {
        //initially
        int start = 0;
        int end = 0;

        // for every element in the array.
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // Largest element in the array.
            end = end + nums[i]; // Sum of all the values in the array.
        }

        // Now apply BS.
        while (start < end) {
            // try for the middle as possible ans.
            int mid = start + (end - start) / 2;

            // calculate how many pieces can be formed using the max sum (mid).
            int sum = 0; // initially it is 0.
            int pieces = 1; // because min 1 piece we can start with i.e. the entire array.

            // now we use for-each loop.
           for(int element : nums) {
               if (sum + element > mid) {
                   // "sum + element > mid" means i.e you cannot add elements into this subarray as it exceeds the mid.
                   // make new one, then sum = element. As the new subarray will start with this element.
                   sum = element;
                   pieces++;
               } else {
                   sum = sum + element;
               }
           }

           if (pieces > k) { // check 1
               start = mid + 1;
           }
           if (pieces < k) { // check 2
               end = mid;
           }
        }
        return end; // or start, because in the start == end.
    }
}
