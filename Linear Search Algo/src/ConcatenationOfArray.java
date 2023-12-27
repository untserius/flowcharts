import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {

//        Input: nums = [1,2,1]
//        Output: [1,2,1,1,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]

        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(concatenation(nums)));
    }

    static int[] concatenation(int[] nums) {
        int n= nums.length;
        int ans[] = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
