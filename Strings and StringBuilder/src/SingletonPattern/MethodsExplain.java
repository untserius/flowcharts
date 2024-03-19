package SingletonPattern;

public class MethodsExplain {

    public void A(){
        System.out.println("Non-static method A");
    }

    public static void B(){
        System.out.println("Static method B");
    }

    public static void main(String[] args) {
        MethodsExplain e = new MethodsExplain();
        e.A();

        MethodsExplain.B();
    }
}
