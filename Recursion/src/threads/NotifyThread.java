package threads;

public class NotifyThread extends Thread {
    int total = 0;

    public synchronized void run(){
        for (int i = 0; i < 100; i++) {
            total = total + i;
        }
        notify();
    }

    public static void main(String[] args) {
        NotifyThread th = new NotifyThread();
        th.start();

        synchronized (th){
            try {
                th.wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(th.total);
    }
}


