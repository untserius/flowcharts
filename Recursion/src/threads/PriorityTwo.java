package threads;

public class PriorityTwo {
    public static void main(String[] args) {
        Priority th1 = new Priority();
        th1.setPriority(2);
        Priority th2 = new Priority();
        th2.setPriority(1);
        Priority th3 = new Priority();
        th3.setPriority(9);

        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());
        System.out.println(th3.getPriority());
    }
}
