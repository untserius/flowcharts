public class CountNegativeInSortedArray {
    public static void main(String[] args) {

        int grid[][] = {
                {3, 2},
                {1, 0}
        };
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {

        int ans = 0;
        for (int[] a : grid) {
            ans = ans + findNegatives(a);
        }
        return ans;
    }

    static int findNegatives(int[] a) {
        int rStart = 0;
        int rEnd = a.length - 1;
        int tempIndex = 0;

        // edge cases
        // 1.
        if (a[0] < 0) {
            return a.length; // because if first element is negative, all the elements are negative in that row.
        }

        // 2.
        if (a[a.length - 1] >= 0) {
            return 0; // because if last element is positive, there is no negative elements in that row.
        }

        while (rStart <= rEnd) {

            int mid = rStart + (rEnd - rStart) / 2;

            if (a[mid] < 0) {
                tempIndex = mid;
                rEnd = mid - 1;
            } else {
                rStart = mid + 1;
            }
        }
        return a.length - tempIndex; // because tempIndex is the 1st position of 1st negative element, as we know all the elements after that are also negative.
                                    // Thus a.length = last index & tempIndex = first index.
                                    // So, ans is last - first = total no. of negative elements in that row.
    }
}
