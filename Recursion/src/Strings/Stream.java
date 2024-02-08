package Strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "bacchsah");

        String ans = skipWithoutArgs("aazazazazazaza");
        System.out.println(ans);

        String ans2 = skipApple("Souradip is a appleboy");
        System.out.println(ans2);

        System.out.println(skipAppNotApple("abcdappleabcd"));
        System.out.println(skipAppNotApple("abcdapplicationabcd"));

    }

    static void skip(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skipWithoutArgs(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipWithoutArgs(up.substring(1));
        } else {
            return ch + skipWithoutArgs(up.substring(1));
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

}
