public class Armstrong2 {
    public static void main(String[] args) {
        // How many 3 digits armstrong numbers are there ?
        for (int i = 100; i < 1000; i++) {            // i = 100 (it's the lowest 3 digit no.), i < 1000 (it's the lowest 4 digit num.)
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong (int i) {
        int original = i;
        int sum = 0;

        while (i > 0) {
            int rem = i % 10;
            i = i/10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original) {
            return true;
        }
        return false;
    }
}
