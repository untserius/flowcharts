public class Floor {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 12, 23, 34};
        //int[] arr = {54, 23, 12, 1, 0, -4};
        int target = 13;
        int ans = floor(arr, target);
        System.out.println(ans);

    }

    static int floor(int[] arr, int target) {

//       if (target < arr[arr.length - 1]) {
//            return -1;
//        }

        int s = 0;
        int e = arr.length -1;

        boolean isAsc = arr[s] < arr[e];

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    e = mid - 1;
                }

                if (target > arr[mid]) {
                    s = mid + 1;
                }

            } else {
                    if (target > arr[mid]) {
                        e = mid - 1;
                    }
                    if (target < arr[mid]) {
                        s = mid + 1;
                    }
                }
            }
        return e;
    }
}
