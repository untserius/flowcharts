import java.util.ArrayList;

public class Candies {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 5, 3};
        System.out.println(candies(nums, 3));
    }
    static ArrayList<Boolean> candies(int[] candies, int extracans) {


        ArrayList<Boolean> h = new ArrayList<>();

        int max = 0;


        for (int i : candies) {

            if (i > max) {
                max = i;
            }

        }

        for (int i = 0; i < candies.length; i++) {


            if (candies[i] + extracans >= max) h.add(true);
            else h.add(false);
        }
        return h;
    }
}
