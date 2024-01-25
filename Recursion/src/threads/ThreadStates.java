package threads;

public class ThreadStates extends Thread{
    public static void main(String[] args) {
        ThreadStates th = new ThreadStates();

        System.out.println(th.getState());

        th.start();
        System.out.println(th.getState());

        try {
            th.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(th.getState());

    }
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
