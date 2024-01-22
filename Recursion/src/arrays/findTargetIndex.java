package arrays;

import java.util.ArrayList;

public class findTargetIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 55, 6, 7, 7, 8, 8};
        System.out.println(find(arr, 55, 3));
        System.out.println(findIndex(arr, 55, 0));

//        findAllIndex(arr, 7, 0);
//        System.out.println(list);

        System.out.println(findAllIndex2(arr, 8, 0, list));
        System.out.println(findAllIndex3(arr, 8, 0));
    }

    // return true or false
    static boolean find(int[] arr, int target, int index){
        // base condition
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }

    // find the target index no.
    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        } else {
            return findIndex(arr, target, index+1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void  findAllIndex(int[] arr, int target, int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex2(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {

        ArrayList<Integer> list1 = new ArrayList<>();

        if(index == arr.length){
            return list1;
        }

        // for that particular func. call
        if (arr[index] == target){
            list1.add(index);
        }
        ArrayList<Integer> addAllAns = findAllIndex2(arr, target, index+1, list1);

        list1.addAll(addAllAns);

        return list1;
    }
}
