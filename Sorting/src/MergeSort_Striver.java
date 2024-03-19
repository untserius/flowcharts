import java.util.ArrayList;

public class MergeSort_Striver {
    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int[] res = mergeSort(arr, 0, arr.length - 1);

        for (int e : res){
            System.out.print(e + " ");
        }


    }

    public static int[] mergeSort(int[] arr, int s, int e){
        if(s >= e){
            return arr;
        }

        int mid = (s+e)/2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        return mergeFinal(arr, s, mid, e);
    }

    public static int[] mergeFinal(int[] arr, int s, int mid, int e){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = s;
        int right = mid + 1;

        while (left <= mid && right <= e){
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while (right <= e){
            temp.add(arr[right]);
            right++;
        }

        for (int i = s; i <= e; i++){
            arr[i] = temp.get(i - s);
        }

        return arr;
    }
}
