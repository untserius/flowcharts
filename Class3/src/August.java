import java.util.Scanner;

public class August {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Q. No. of even days in a month.

        int n = input.nextInt();
        int count = 0;

        for (int i = 1; i<=n; i++) {
            if (i%2 == 0) {
                count++;
            }

        }
        System.out.println("Number of days that Kunal can go are: " + count );

        // Sum of the digits of a number.

//        int n = 21879;
//
//        int i = 0;
//        while (n > 0) {
//            int rem = n%10;
//            n = n/10;
//            i = i + rem;
//        }
//        System.out.println(i);

    }
}