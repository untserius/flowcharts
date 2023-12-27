public class SearchInString {
    public static void main(String[] args) {

        // Q. Return the index of the array.
        String name = "Sudhir";
        char target = 'd';
        System.out.println(searchIndex(name, target));
        System.out.println(searchBoolean(name, target));
    }

    static int searchIndex(String naam, char target) {

        if (naam.length() == 0) {
            return -1;
        }
        for (int i = 0; i < naam.length(); i++) {
            char letter = naam.charAt(i);
            if (letter == target) {
                return i;
            }
        }
        return -1;
    }

    // Q. Return true or false, if the element is present in the array.
    static boolean searchBoolean(String naam, char target) {

        if (naam.length() == 0) {
            return false;
        }
        for (int i = 0; i < naam.length(); i++) {
            char letter = naam.charAt(i);
            if (letter == target) {
                return true;
            }
        }
        return false;
    }
}
