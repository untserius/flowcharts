package threads;

public class D extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        D th = new D();
        th.start();

        while(th.isAlive()){
            System.out.println("Waiting....");
        }

        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run(){
        amount++;
    }
}
