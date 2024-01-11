package arrays;

import java.util.ArrayList;
public class findList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        ArrayList<Integer> ans = findAllIndex(arr, 5, 0, new ArrayList<>());
        System.out.println(ans);

    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
}
