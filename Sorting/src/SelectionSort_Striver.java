public class SelectionSort_Striver {
    static int[] selectionSort(int[] arr, int n){
        for (int i = 0; i < n - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimum]){
                    minimum = j;
                }
            }

            // swap
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 67, 34, 21};
        int n = arr.length;

        int[] res = selectionSort(arr, n);

        for (int elements : res){
            System.out.print(elements + " ");
        }

//        System.out.println(Arrays.toString(selectionSort(arr, n)));
    }
}
