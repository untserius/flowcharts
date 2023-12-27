public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {

        // base condition (stopping condition of recursion)
        // without this an error will occur, which is called "STACK OVERFLOW ERROR"
        if (n == 5) {
            System.out.println(5);
            return;
        }

        // This is know as tail recursion.
        System.out.println(n);
        print(n + 1);
    }
}
