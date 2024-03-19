public class SplitTest {
    public static void main(String[] args) {
        String[] str = "Hello, I am Serius!, I live in India, I am a Hindu".split(",");
//        System.out.println(Arrays.toString(str));

        for (String part : str){
            System.out.println(part);
        }
    }
}
