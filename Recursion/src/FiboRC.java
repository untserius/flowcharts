public class FiboRC {
    public static void main(String[] args) {

        int ans = fibo(3);
        System.out.println(ans);
    }

    static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2); // recursive relation
    }
}

/* How to understand & approach a problem :

1. Identify if you can break down problem into smaller problems.
2. Write the recursive relation if needed.
3. Draw the recursive tree.
4. About the tree :
        1. See the flow of functions.
        2. How they are getting in stack.
        3. Identify & focus on left tree and right tree called.
        4. Draw the tree and pointer again and again using pen & paper.
        5. Use a debugger to see the flow.
5. See how the values & what type of values are returned at each step.
6. See where the function call will come out.
7. In the end you will come out of the main function.

 */

