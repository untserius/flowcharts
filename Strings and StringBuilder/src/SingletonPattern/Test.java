package SingletonPattern;

public class Test {
    public void X(){
        System.out.println("X");
    };
    public static void Y(){
        System.out.println("Y");
    };

    public static void main(String[] args) {
        Test t = new Test();
        t.X();

        Test.Y();
    }
}
