import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Appliance: ");
        String app = input.next();

        double kwh;
        int hrs;
        double unit;
        double bill1 = 0;
        double bill2 = 0;
        double bill3 = 0;
        double bill4 = 0;
        double bill5 = 0;
        double bill6 = 0;
        double total;
        double month;

        switch (app) {
            case "Fan":
                System.out.println("Enter Hours of use/day for Fan: ");
                hrs = input.nextInt();
                kwh = 80 * hrs; // kwh = W x t
                unit = kwh/1000; // total power consumed/1000

                bill1 = unit * 9;

                System.out.println("Per Day Bill Amount: Fan = ₹ " + bill1 + " /-");
            case "Led":
                System.out.println("Enter Hours of use/day for LED: ");
                hrs = input.nextInt();
                kwh = 25 * hrs; // kwh = W x t
                unit = kwh/1000; // total power consumed/1000

                bill2 = unit * 9;

                System.out.println("Per Day Bill Amount: LED = ₹ " + bill2 + " /-");
            case "Refrigerator":
                System.out.println("Enter Hours of use/day for Refrigerator: ");
                hrs = input.nextInt();
                kwh = 250 * hrs; // kwh = W x t
                unit = kwh/1000; // total power consumed/1000

                bill3 = unit * 9;

                System.out.println("Per Day Bill Amount: Refrigerator = ₹ " + bill3 + " /-");
            case "AC":
                System.out.println("Enter Hours of use/day for AC: ");
                hrs = input.nextInt();
                kwh = 900 * hrs; // kwh = W x t
                unit = kwh/1000; // total power consumed/1000

                bill4 = unit * 9;

                System.out.println("Per Day Bill Amount: AC = ₹ " + bill4 + " /-");
            case "TV":
                System.out.println("Enter Hours of use/day for TV: ");
                hrs = input.nextInt();
                kwh = 120 * hrs; // kwh = W x t
                unit = kwh/1000; // total power consumed/1000

                bill5 = unit * 9;

                System.out.println("Per Day Bill Amount: LED = ₹ " + bill5 + " /-");
            case "Washing":
                System.out.println("Enter Hours of use/day for Washing: ");
                hrs = input.nextInt();
                kwh = 1500 * hrs; // kwh = W x t
                unit = kwh/1000; // total power consumed/1000

                bill6 = unit * 9;

                System.out.println("Per Day Bill Amount: LED = ₹ " + bill6 + " /-");


            total = bill1 + bill2 + bill3 + bill4 + bill5 + bill6;
            System.out.println("Total Per Day Bill: ₹ " + total + " /-");

            month = total * 30;

            System.out.println("Your monthly bill amount is ₹ " + month + " /-");
            break;
        }
    }
}
