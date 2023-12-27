import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int empID = in.nextInt();

        System.out.println("Enter Employee Department");
        String dep = in.next();

        switch (empID) {
            case 1 -> {
                System.out.println("Sudhir Das");
                if ("IT".equals(dep)) {
                    System.out.println("IT Department");
                    System.out.println("Contact No. 9777959123");
                    System.out.println("Address: Bhubaneswar, Odisha");
                }
            }
            case 2 -> {
                System.out.println("Subhransu Sekhar");
                if ("Pharma".equals(dep)) {
                    System.out.println("Pharmacy Department");
                    System.out.println("Contact No. 4387583456");
                    System.out.println("Address: Khurda, Odisha");
                }
            }
            case 3 -> {
                System.out.println("Swanyansu");
                if ("Agri".equals(dep)) {
                    System.out.println("Agriculture Department");
                    System.out.println("Contact No. 647334647");
                    System.out.println("Address: Cuttuck, Odisha");
                }
            }
            default -> System.out.println("Invalid Request! Please Try Again Later.");
        }
    }

}
