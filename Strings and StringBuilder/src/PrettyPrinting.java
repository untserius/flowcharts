public class PrettyPrinting {
    public static void main(String[] args) {

        /*
        There are many format specifiers we can use. Here are some common ones:

        %c - Character
        %d - Decimal number (base 10)
        %e - Exponential floating-point number
        %f - Floating-point number
        %i - Integer (base 10)
        %o - Octal number (base 8)
        %s - String
        %u - Unsigned decimal (integer) number
        %x - Hexadecimal number (base 16)
        %t - Date/time
        %n - Newline
         */

        float a = 234.6449f;
       // System.out.printf("The formatted number is %.2f", a);

        System.out.println(Math.PI);
        System.out.printf("The value of pie is %.2f", Math.PI);

        System.out.printf(" Hello My name is %s and I am very %s", "Sudhir", "tall"); // % is used as placeholder.

    }

}
