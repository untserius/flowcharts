import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float a = input.nextInt();
//        System.out.println(a);

        // explicit type casting
        //int b = (int)(54.67f);
        //System.out.println(b);

//      another example of explicit casting
//        int x = 257;
//        byte v = (byte)(x); // 257 % 256 = 1 i.e. the remainder
//        System.out.println(v);
//
//        byte a = 50;
//        byte b = 30;
//        byte c = 100;
//        int d = a*b/c;
//        System.out.println(d);

//      another eg. of type conversion
//        int h = 'B';
//        System.out.println(h);

        // automatic conversion of type
            byte b = 34;
            char c = 'a';
            short s = 5678;
            int i = 4500;
            float f = 45.56f;
            double d = 1.005;
            double result = (f*b)+(i/c)+(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
                // output = float + int + double = double
            System.out.println(result);


    }
}
