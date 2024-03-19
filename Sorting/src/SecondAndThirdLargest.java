public class SecondAndThirdLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 67, 34, 112};

        int l = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        int l3 = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i] > l){
                l3 = l2;
                l2 = l;
                l = arr[i];
            } else if(arr[i] > l2 && arr[i] != l){
                l3 = l2;
                l2 = arr[i];
            } else if(arr[i] > l3 && arr[i] != l2 && arr[i] != l){
                l3 = arr[i];
            }
        }

        System.out.println(l);

        if (l2 == Integer.MIN_VALUE){
            System.out.println("This is no second largest element");
        } else {
            System.out.println(l2);
        }

        if (l3 == Integer.MIN_VALUE){
            System.out.println("This is no third largest element");
        } else {
            System.out.println(l3);
        }
    }
}
