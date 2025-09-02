class Phone{
    public String model;
    public String color;
    public Phone(){
        System.out.println("생성자가 실행");
        model  ="전화기";
        color = "하얀색";
    }
}

class smartphone extends Phone{     //상속
    public smartphone(){
        System.out.println("smartphone() 생성자 실행!");
        this.model ="삼성";
    }
    public void run(){
        System.out.println("핸드폰이 동작한다.");
    }
}

public class Main {
    public static void main(String[] args) {
        smartphone myphone = new smartphone();
        System.out.println(myphone.color   );
        System.out.println(myphone.model);
        myphone.run();
    }
}