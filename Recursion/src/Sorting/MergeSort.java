package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6, 2};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){

        // base condition
        if (arr.length == 1){
            return arr;
        }

        // create a mid point
        int mid = arr.length / 2;

        // create 2 parts of the array by copying the range
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){

        // create a new array of size of original array (arr1 + arr2)
        int[] mix = new int[first.length + second.length];

        // initialize pointers
        int i = 0;
        int j = 0;
        int k = 0;

        // logic to swap for sorting
        while(i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete
        // then just copy the remaining elements from that array

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
