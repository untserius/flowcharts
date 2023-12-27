import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Multiple if else conditions

        System.out.println("Enter your present salary: ");
        int salary = input.nextInt();
        if (salary > 30000) {
            salary = salary + 1000;
        }
        else if ( salary > 50000){
            salary += 500;
        }
        else {
            salary += 2000;
        }

        System.out.println("Your new salary is: "+ salary);
    }
}