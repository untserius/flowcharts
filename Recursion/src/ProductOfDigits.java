public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = digitproduct(321);
        System.out.println(ans);
    }
    static int digitproduct(int n){

        if (n%10 == n) {
            return n;
        }

        return n%10 * digitproduct(n/10);
    }
}
