package threads;

public class RunAndStart extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        RunAndStart th = new RunAndStart();
        th.start();
        th.run();
    }
}
