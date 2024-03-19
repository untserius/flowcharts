public class SelectionSort3_Striver {
    public static int[] selectionsort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]){
                    mini = j;
                }
            }

            // Swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 5, 9, 8, 67, 45, 22, 56};

        int[] res = selectionsort(nums);

        for (int element : res){
            System.out.print(element + " ");
        }
    }
}
