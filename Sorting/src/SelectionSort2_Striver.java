public class SelectionSort2_Striver {

    public int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int mini = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[mini]){
                    mini = j;
                }
            }

            // swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] num = {3, 2, 1, 5, 4, 9, 8, 7, 6};
        SelectionSort2_Striver s1 = new SelectionSort2_Striver();
        int[] res = s1.selectionSort(num);

        for (int element : res){
            System.out.print(element + " ");
        }
    }


}
