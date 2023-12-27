import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // assignment no 2.
        System.out.println("Please enter your name: ");

        String Name = sc.nextLine();
        System.out.println("Hi!" + Name + "I hope you are having a nice day!" );
    }
}

