package threads;

public class DaemonThread extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
    }
}
