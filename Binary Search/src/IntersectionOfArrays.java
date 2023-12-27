import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 2, 2, 1};
        int[] arr2 = {2, 2, 3};

        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {

        // to sort the arrays, functions created for sorting.
        cyclic(nums1);
        cyclic(nums2);

        // assigning new array smaller which space is small and larger whose space size is large.
        // function 1.
        int[] smaller;
        if (nums1.length <= nums2.length) {
            smaller = nums1;
        } else {
            smaller = nums2;
        }

        // function 2.
        int[] larger;
        if (nums1.length > nums2.length) {
            larger = nums1;
        } else {
            larger = nums2;
        }

        int lastNum = -1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < smaller.length; i++) {
            if (smaller[i] != lastNum && binarySearch(larger, smaller[i])) {
                list.add(smaller[i]);
            }
            lastNum = smaller[i];
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    static boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;

    }
}
