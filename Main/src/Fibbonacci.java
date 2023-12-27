import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        int f1 = 0;
        int f2 = 1;
        int f3;

        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        System.out.print("The fibonacci series is ");
        if (n == 1) {
            System.out.print(f1);
        }
        else if (n == 2) {
            System.out.print(f1 +" "+ f2);
        }
        else if (n > 2 ) {
            System.out.print(f1 +" "+ f2 +" ");
            for (int i = 3; i<=n; i++);
            {
                f3 = f1 + f2;
                System.out.print( f3 + "");
                f1 = f2;
                f2 = f3;

            }
        }
        else {
            System.out.print("Input is Invalid");
        }
    }
}
