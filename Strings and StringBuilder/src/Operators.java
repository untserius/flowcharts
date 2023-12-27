import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b'); // This sums up the ASCII value of these characters.
        System.out.println("a" + "b"); // This concatenates the two characters.
        System.out.println("a" + 3); // This adds the value of the character with the given integer.
        System.out.println((char)('a' + 3)); // This adds the character and the integer to its respective character.

        // but
        System.out.println("a" + 1);
        // integer will convert into Integer that will call .toString().

        System.out.println("Sudhir" + new ArrayList<>());
        System.out.println("Sudhir" + new Integer(34));

        //System.out.println(new Integer(23) + new ArrayList<>()); // This will not work because + operator needs atleast one primitive datatype.
        System.out.println(new Integer(235) + "" + new ArrayList<>());
    }
}
