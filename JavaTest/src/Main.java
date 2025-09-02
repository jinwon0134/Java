class Calculator {
    Calculator() {

    }
    // 멤버 메소드
    public static int Plus(int a, int b) {
        return a + b;
    }

    public static int Minus(int a, int b) {
        return a - b;
    }
    public int Multiply(int a, int b) {
        return a * b;
    }
    public double Divide(double a, double b) {
        return (double)a / b;
    }
}
public class Main {

    // *, -, * /
    public static void main(String[] args){
        Calculator myCal = new Calculator();
        int a = 5,  b = 7;
        System.out.println(myCal.Plus(a, b));
        System.out.println(myCal.Minus(a, b));


    }
}