import java.util.Scanner;

public class FiboFinal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = in.nextInt();
        int firstterm = 0;
        int secondterm = 1;

        for (int i =1; i<=input; i++) {
            System.out.println(firstterm + " ");

            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
    }
}