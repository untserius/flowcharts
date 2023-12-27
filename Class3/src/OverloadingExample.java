import java.util.Scanner;

public class OverloadingExample {
    public static void main(String[] args) {

     int ans1 = call(1,2);
     int ans2 = call(1,2,3);
     System.out.println(ans1);
     System.out.println(ans2);
    }
    static int call(int a, int b) {
        return a + b;
    }
    static int call(int a, int b, int c) {
        return a + b + c;
    }

}
