import java.text.DecimalFormat;
import java.util.Arrays;

public class stringBufferExample {
    public static void main(String[] args) {
        //Constructor 1
        StringBuffer sb = new StringBuffer();

        //Constructor 2
        StringBuffer sb2 = new StringBuffer("Sudhir Das");

        //Constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        sb.append("Hello!");
        sb.append(" My name is Java");

        sb.insert(5, " World");
        sb.replace(0, 5, "Hi");

        sb.delete(4, 5);
        sb.reverse();

        String str = sb.toString();
        System.out.println(str);

        String str2 = sb2.toString();
        System.out.println(str2);

        String str3 = sb3.toString();
        System.out.println(sb3.capacity());

        //-------------------------------------------

        int n = 20;
        RandomStrings rs = new RandomStrings();
        System.out.println(rs.generate(n));

        //---------------------------------------------

        //Remove whitespaces

        String str4 = "dv  e f fe  g g e ge g g  ssss";
        System.out.println(str4);
        System.out.println(str4.replaceAll("\\s", ""));

        //Split

        String str5 = "Rahul Gaurav Kartik Amrit";
        String str6 = "Rahul,Gaurav,Kartik,Amrit";
        String[] names = str5.split(" ");
        String[] names2 = str6.split(",");

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names2));

        //Decimal Format (Rounding off)

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(5.697));
    }
}
