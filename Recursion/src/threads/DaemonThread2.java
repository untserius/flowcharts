package threads;

public class DaemonThread2 {
    public static void main(String[] args) {
        DaemonThread dh = new DaemonThread();
        dh.setDaemon(true);
        System.out.println(dh.isDaemon());

        //Thread State
        System.out.println(dh.getState());

    }
}
