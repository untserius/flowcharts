import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 3, 1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {

        int i = 0;
        while (i <= arr.length - 1) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) { // explanation - https://www.youtube.com/watch?v=JfinxytTYFQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=20
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
