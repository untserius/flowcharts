public class SetMismatch {
    public static void main(String[] args) {

    }

    static int[] findErrorNums(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // find the missing num.
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index+1};// nums[index] is the duplicate num & index + 1 is the missing num.
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
