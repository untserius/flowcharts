public class Allprimenumbersbetweentwonumbers {
    public static void main(String[] args) {

        for (int i=5; i<=20; i++) {
            if (check(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean check(int i) {

            int rem = i%2;

            if (rem == 0) {
                return false;
            }
            return true;
    }
}
