import java.util.ArrayList;

public class MergeSort_Striver {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        mergeSort(arr, 0, arr.length - 1);

        for (int e : arr){
            System.out.print(e + " ");
        }
    }

    public static void mergeSort(int[] arr, int s, int e){
        if(s >= e){
            return;
        }

        int mid = (s+e)/2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        mergeFinal(arr, s, mid, e);
    }

    public static void mergeFinal(int[] arr, int s, int mid, int e){

        // Using new array[]

        int[] temp2 = new int[e - s + 1];

        int left = s;
        int right = mid + 1;
        int index = 0;

        while(left <= mid && right <= e){
            if (arr[left] <= arr[right]){
                temp2[index] = arr[left];
                left++;
            } else {
                temp2[index] = arr[right];
                right++;
            }
            index++;
        }

        while (left <= mid){
            temp2[index] = arr[left];
            left++;
            index++;
        }

        while (right <= e){
            temp2[index] = arr[right];
            right++;
            index++;
        }

        System.arraycopy(temp2, 0, arr, s, temp2.length);


        // Using new ArrayList<>

//        ArrayList<Integer> temp = new ArrayList<>();
//        int left = s;
//        int right = mid + 1;
//
//        while (left <= mid && right <= e){
//            if (arr[left] <= arr[right]){
//                temp.add(arr[left]);
//                left++;
//            } else {
//                temp.add(arr[right]);
//                right++;
//            }
//        }
//
//        while (left <= mid){
//            temp.add(arr[left]);
//            left++;
//        }
//
//        while (right <= e){
//            temp.add(arr[right]);
//            right++;
//        }
//
//        for (int i = s; i <= e; i++){
//            arr[i] = temp.get(i - s);
//        }
    }
}
