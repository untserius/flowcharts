package threads;

public class Multithreading {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            MultithreadingThing myThing = new MultithreadingThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            myThread.isAlive();
//            try {
//                myThing.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
