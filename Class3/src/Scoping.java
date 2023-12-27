public class Scoping {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        {

           // int a = 300; // It gives an error - int a = 100 i.e. initialised/defined outside the block within function main{}.
            a = 300; // But we can change the value of the original ref. variable "a" or simply use it.

            int c = 600;

            int e = 400;
        }
        int c = 500; // Here we can define the value of c = 500; because it' s outside the block.
        //System.out.println(e); // It gives an error - "e" is defined in the block above, so we cannot use outside the block.



    }
    // Anything that is initialised outside the block - can be used inside the block.
//                                  inside            - cannot be used outside the block

    // Anything that is initialised outside the block cannot be again initialised inside the block.
    //                              inside             can definately initialised again outside the block.

}
