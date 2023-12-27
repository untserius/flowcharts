public class Shadowing {

    static int x = 100; //this will be shadowed.

    public static void main(String[] args) {

        System.out.println(x);
        int x = 300;
        System.out.println(x);

        hello();
    }

    static void hello() {
        System.out.println(x);
    }
}
