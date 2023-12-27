public class Swap2 {
    public static void main(String[] args) {

        String name = "Sudhir Das";
        change(name);

    }
                                                        // The variable must not be same while calling functions because
                                             // In JAVA - it's passing by value of the object not passing by ref. var.
    static void change(String naam) {
        System.out.println(naam);
    }
}
