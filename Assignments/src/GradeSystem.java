import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Marks        Grade
        //91-100         AA
        //81-90          AB
        //71-80          BB
        //61-70          BC
        //51-60          CD
        //41-50          DD
        //<=40          Fail

        System.out.println("Enter your marks (English): ");
        int eng = in.nextInt();
        System.out.println("Enter your marks (Mathematics): ");
        int math = in.nextInt();
        System.out.println("Enter your marks (Physics): ");
        int phy = in.nextInt();
        System.out.println("Enter your marks (Chemistry): ");
        int che = in.nextInt();
        System.out.println("Enter your marks (Biology): ");
        int bio = in.nextInt();

        int sum = eng + phy + math + che + bio;

        System.out.println("Total Marks is " + sum + "/500");

        double percent = ((sum*100)/500);

        if (percent <= 40) {
            System.out.println("Grade - Fail");
        } else if (percent >= 41 && percent < 50) {
            System.out.println("Grade - DD");
        } else if (percent >= 61 && percent < 70) {
            System.out.println("Grade - BC");
        } else if (percent >= 71 && percent < 80) {
            System.out.println("Grade - BB");
        } else if (percent >= 81 && percent < 90) {
            System.out.println("Grade - AB");
        } else if (percent >= 91 && percent < 100) {
            System.out.println("Grade - AA");
        }

        float cgpa = (percent/9.5);

        System.out.println("CGPA is " + cgpa);
    }
}