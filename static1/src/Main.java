class Calculator {
    static  double pi = 3.141592;

    public  static int plus(int a,int b){
        return a+b;
    }
    public  static int minus(int a,int b){
        return a-b;
    }
}

public class Main {
    public static void main(String[] args) {
        double result1 = Calculator.pi;
        int result2 = Calculator.plus(10,5);
        int result3 = Calculator.minus(10,5);
        System.out.println(result2);
        System.out.println(result1);
        System.out.println(result3);
    }
}