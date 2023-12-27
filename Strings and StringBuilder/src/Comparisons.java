public class Comparisons {
    public static void main(String[] args) {

        // 1. == - It is known as comparator.

        String a = "Sudhir";

        String b = "Sudhir";

        System.out.println(a == b); // This will give "true" - a & b are both pointing to the same object.

        String name1 = new String("Sudhir");
        String name2 = new String("Sudhir");

        System.out.println(name1 == name2); // This will give "false" - name1 & name2 instead of pointing to the same object, they are pointing to the two different objects made outside of the string pool.

        // .equals method
        System.out.println(name1.equals(name2)); // This will give "true" - .equals method only care about the values of the objects created.
    }
}