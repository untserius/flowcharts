import java.util.Arrays;

public class SortedMatrix2DArrayRevised {
    public static void main(String[] args) {

        int[][] arr = {

                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120},
                {130, 140, 150, 160}
        };

        System.out.println((search(arr, 146)));
    }

    static boolean[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        // Why int row? = bcuz we are passing at which row you want to search.
        // Why cStart cEnd? = bcuz we are searching column wise.
        while (cStart <= cEnd) {

            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new boolean[]{true};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new boolean[]{false};

    }
    static boolean[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; // because array may be empty, so check the cols size @ 0th index.

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        // run the loop till 2 rows are remaining.
        // conditions for the 2 rows are remaining = rStart = rEnd -1;

        int rStart = 0;
        int rEnd = matrix.length -1; // rows - 1;
        int cMid = cols / 2;

        while (rStart < rEnd - 1) { // if this is true that means there are more than 2 rows & we have to eliminate rows.

            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new boolean[]{true};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now that we found 2 remaining rows.
        // check whether the target is in the middle column.
        if (matrix[rStart][cMid] == target) { // This is row 1 or starting row.
            return new boolean[]{true};
        }
        /* similarly */
        if (matrix[rStart + 1][cMid] == target) { // This row 2. or ending row because if starting row = rStart, then ending row we can write as rStart + 1 = rEnd
            return new boolean[]{true};
        }

        // if ans not found, search in all the four parts.
        // 1st half.
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // 2nd half.
        if (target <= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) { // "&& target <= matrix[rStart][cols - 1]" to make the search to be limited upto the last element of the row.
            return binarySearch(matrix, rStart, cMid+1, cols - 1, target);
        }
        // 3rd half.
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart+1, 0, cMid -1, target);
        } else {
            // 4the half.
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
