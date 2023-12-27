import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        String name = "Sudhir Das";
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('h'));
        System.out.println("   name   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
