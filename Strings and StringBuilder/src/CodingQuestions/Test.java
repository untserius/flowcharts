package CodingQuestions;

public class Test {
    public void x(){
        System.out.println("void method");
    }

    public int x(int x){
        return x;
    }

    public String x(String x){
        return x;
    }

    public int x(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        int result = t1.x(12,6);
        System.out.println(result);
    }
}
