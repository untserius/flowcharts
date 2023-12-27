import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abfdcba";
        System.out.println(IsPalindrome(str));

    }

    static boolean IsPalindrome(String str) {

        if(str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end)
                return false;
        }
        return true;
    }

//    static boolean IsPalindrome2 (String str) {
//
//        StringBuilder builder = new StringBuilder();
//
//        builder = new StringBuilder(str);
//        for (int i = 0; i <= str.length(); i++) {
//            String space = " ";
//            char ch = (char)(space + i)
//        }

}
