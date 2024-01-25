package threads;

public class MultithreadingThing implements Runnable{

    private int threadNo;
    public MultithreadingThing(int threadNo){
        this.threadNo = threadNo;
    }
    public synchronized void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println(i + " from thread " + threadNo);
//            if(threadNo == 2){
//                throw new RuntimeException();
//            }
            try {
                Thread.sleep(1000);
            } catch (Exception ignored){
            }
        }
    }
}
