public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 23, 12, 56, 22, 44};

        // Check largest element
        int largest  = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println(largest);
    }
}
