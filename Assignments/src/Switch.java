import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
// Switch Statements
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a fruit name: ");

        String fruit = input.next();
 /*
        switch (fruit) {
            case "Mango":
                System.out.println("King of all fruits!" );
                break;
            case "Apple":
                System.out.println("Doctor of all fruits");
                break;
            case "Orange":
                System.out.println("Tangiest of all fruits");
                break;
            case "Pineapple":
                System.out.println("My favourite fruit");
                break;
            default:
                System.out.println("Invalid fruit");
        }
*/
        // Enhanced switch statements (Intellij)
/*
        switch (fruit) {
            case "Mango" -> System.out.println("King of all fruits!");
            case "Apple" -> System.out.println("Doctor of all fruits");
            case "Orange" -> System.out.println("Tangiest of all fruits");
            case "Pineapple" -> System.out.println("My favourite fruit");
            default -> System.out.println("Invalid fruit");
       }
*/
        // all days in a week
/*
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");

        }
*/
  /*
        int day = input.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Invalid Input");

        }

 */
   /*
        int day = input.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default -> System.out.println("Invalid Input");
        }

    */
    }
}
