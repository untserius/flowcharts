package abstractpractice;

public class ChildClass extends ParentClass {

    @Override
     private void Test(){
        System.out.println("1");
    }
     void Test2(){
        System.out.println("2");
    }
    public void Test3(){
        System.out.println("3");
    }

    public static void main(String[] args) {
//        ParentClass p1 = new ParentClass(); // Abstract class cannot be instantiated
        ChildClass cc = new ChildClass();
        cc.Test();
        cc.Test2();
        cc.Test3();
    }
}
