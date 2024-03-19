import java.util.Arrays;

public class BubbleSort2_Striver {
    public static int[] bubble(int[] arr){
        for (int i = arr.length - 1; i >= 1; i--){
            for (int j = 0; j <= i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 1, 2, 7, 6, 3, 4, 5};
//        StriverBubbleSort2 b1 = new StriverBubbleSort2();
//        System.out.println(Arrays.toString(b1.bubble(arr)));

        System.out.println(Arrays.toString(bubble(arr)));
    }
}
