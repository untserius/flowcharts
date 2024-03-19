package SingletonPattern;

public class A {
    private static A a; // a variable

//    private static int x;

    private A(){ // a constructor

    }

    public static A xyz(){ // a static method
        if (a == null){
            a = new A();
        }
        return a;
    }

    public static void main(String[] args) {
        A a1 = A.xyz();
        A a2 = A.xyz();
        A a3 =  A.xyz();

//        A a1 = new A();
//        a1.xyz();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

//        System.out.println(a1 == a2);
    }
}
