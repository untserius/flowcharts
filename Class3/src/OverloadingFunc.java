public class OverloadingFunc {
    public static void main(String[] args) {

        anything(56); // If I write a integer, line 6 func. will be executed.
          anything("sudhir");              // If I write a string, line 10 func. will be executed
                                                        // This is known as Function Overloading.
    }
    static void anything(int a) {
        System.out.println(a);
    }
    static void anything(String name) {
        System.out.println(name);
    }
}
