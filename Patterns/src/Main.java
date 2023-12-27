public class Main {
    public static void main(String[] args) {

        pattern13(5);
        
    }
    
    static void pattern1(int n) {
        // Step 1 - Find the no. of lines.
        for (int row = 1; row <= n; row++) {

            // Step 2 - For every row, run the column.
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        // Step 1 - Find the no. of lines.
        for (int row = 1; row <= n; row++) {

            // Step 2 - For every row, run the column.
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        // Step 1 - Find the no. of lines.
        for (int row = 1; row <= n; row++) {

            // Step 2 - For every row, run the column.
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        // Step 1 - Find the no. of lines.
        for (int row = 1; row <= n; row++) {

            // Step 2 - For every row, run the column.
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        // Step 1 - Find the no. of lines.
        for (int row = 0; row < 2 * n; row++) {

            int totalColsInRow;

            if (row > n) {
                totalColsInRow = 2 * n - row;
            } else {
                 totalColsInRow = row;
            }

            // Step 2 - For every row, run the column.
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {

        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < row - 1; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row ++) {

            for (int space = n; space > row; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row * 2) - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = n; row >= 1; row--) {

            for (int space = n; space > row; space--) {
                System.out.print(" ");
            }

            for (int col = 1; col <= (row * 2) - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = n; space > row; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = n; row >= 1; row--) {

            for (int space = n; space > row; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {

            for (int row = 1; row <= n; row++)
        {
            for (int space = 1; space <= row-1; space++)
            {
                System.out.print(" ");
            }

            for (int col = row; col <= n; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++)
        {
            for (int space = 1; space <= n - row; space++)
            {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {

        for (int row=1; row<=n; row++)
        {
            // Print space in decreasing order
            for (int space=n; space>row; space--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int col=1; col<=(row * 2) -1; col++)
            {
                if( col == 1 || col == (row * 2) -1 || row == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {

        for (int row=n; row>=1; row--)
        {
            // Print space in decreasing order
            for (int space=n; space>row; space--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int col=1; col<=(row * 2) -1; col++)
            {
                if( col == 1 || col == (row * 2) -1 || row == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {

        for (int row = 1; row < 2*n; row++) {

            int c;

            if (row > n) {
                c = 2 * n - row;
            } else {
                c = row;
            }

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        // Step 1 - Find the no. of lines.
        for (int row = 0; row < 2 * n; row++) {

            int totalColsInRow;

            if (row > n) {
                totalColsInRow = 2 * n - row;
            } else {
                totalColsInRow = row;
            }

            int totalSpaces = n - totalColsInRow;
            for (int s = 0; s < totalSpaces; s++) {
                System.out.print(" ");
            }
            // Step 2 - For every row, run the column.
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row < n; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {

        int OriginalN = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {

            for (int col = 0; col <= n; col++) {

                // Distances
                int top = row;
                int bottom = n - row;
                int left = col;
                int right = n - col;

                int atEveryIndex = OriginalN - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(atEveryIndex + 1 + " ");
            }
            System.out.println();
        }
    }
}