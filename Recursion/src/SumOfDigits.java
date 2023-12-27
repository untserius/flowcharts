public class SumOfDigits {
    public static void main(String[] args) {
        int ans = digitsum(321);
        System.out.println(ans);
    }
    static int digitsum(int n){

        if (n == 0) {
            return 0;
        }

        return n%10 + digitsum(n/10);
    }
}
