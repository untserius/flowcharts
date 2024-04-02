public class Test {
    public int method(int n) {
        if (n == 0) return 1;
        if (n < 0) n = -n;

        int res = 0;

        while (n != 0){
            n = n / 10;
            res++;
        }
        return res;
    }
}
