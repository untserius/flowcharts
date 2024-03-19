package CodingQuestions;

public class B  {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 677, 45, 67};

        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {8, 9, 0, 1}
        };

        for (int i = 10; i > 0; i--){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int x : arr){
//            System.out.println(x);
//        }
    }
}
;