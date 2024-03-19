import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(",","[","]");

        sj.add("apple").add("pineapple");
        sj.add("banana");
        sj.add("grapes");

//        sj.merge();
        String result = sj.toString();
        System.out.println(result);

    }
}
