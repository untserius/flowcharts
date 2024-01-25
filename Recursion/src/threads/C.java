package threads;

public class C extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        C thread = new C();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run(){
        amount++;
    }
}
