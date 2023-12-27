import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

     call(2, 4, 5, 6, 100, 64, 7,7,7,7,7,7);
     call2("hi", "hello", "How are you");
     mixed(23, 45, "Sudhir");
    }
    static void call(int ...v) { // "...'v'" is used when you have multiple values to input.
        System.out.println(Arrays.toString(v));

    }
    static void call2(String ...x) {
        System.out.println(Arrays.toString(x));

    }
    static void mixed(int a, int b, String ...y ) {
        System.out.print(a +" " + b);
        System.out.print(Arrays.toString(y));
    }

}
