package threads;

public class A extends Thread{
    public void run(){
        System.out.println("inside thread");
    }

    public static void main(String[] args) {
        A thread = new A();
        thread.start();
        System.out.println("outside thread");
    }
}
