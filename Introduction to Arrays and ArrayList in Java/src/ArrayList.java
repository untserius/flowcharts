public class ArrayList {
    public static void main(String[] args) {

        // syntax
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list.contains(1)); // if it contains 1 in any of the indices then it returns true or false if not.
        list.set(5, 34); // created a change at 5th index of array to 34.
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
