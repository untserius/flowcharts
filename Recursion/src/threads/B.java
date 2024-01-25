package threads;

public class B implements Runnable{
    public void run(){
        System.out.println("inside thread");
    }

    public static void main(String[] args) {
        B obj = new B();
        Thread th = new Thread(obj);
        th.start();
        System.out.println("outside thread");
    }
}
