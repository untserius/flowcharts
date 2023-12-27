import java.util.Arrays;

public class Change_value_example_using_arrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3,56,7};
        change (arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int [] nums) {
        nums[0] = 45;
    }

}
