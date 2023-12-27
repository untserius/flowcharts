public class NumberOfGoodPairs {
    public static void main(String[] args) {

        // Given an array of integers nums, return the number of good pairs.
        //A pair (i, j) is called good if nums[i] == nums[j] and i < j.

        int[] arr = {1, 1, 2, 3, 1, 1, 5}; // num of good pairs are (0,1) (0,4) (0,5) (1,4) (1,5) (4,5) = 6 pairs
        System.out.println(goodPairs(arr));
    }

    static int goodPairs(int[] nums) {

        // Optimized.
        int[] temp = new int[101];
        int res = 0;
        for ( int i = 0; i < nums.length; i++) {
            res = res + temp[nums[i]];
            temp[nums[i]]++;
        }
        return res;




        // Brute force approach.
//        int ans = 0;
//        for (int i =0; i < nums.length; i++) {
//            for (int j = i +1; j<nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    ans++;
//                }
//            }
//        }
//        return ans;
    }
}
