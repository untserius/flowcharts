public class Return4 {
    public static void main(String[] args) {

        String start = greet("Sudhir");
        System.out.println(start);
    }

    static String greet(String naam) {
        String message  = "Hello " + naam;
        return message;
    }

}
