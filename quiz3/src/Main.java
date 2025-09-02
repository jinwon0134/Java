class Car
{
    String model;
    int speed;

    Car(String model){
        this.model = model;
        // speed는 0으로 초기화
    }
    // 메소드
    void setSpeed(int speed){
        this.speed=speed;
    }
    void run(){
        this.setSpeed(100);
        System.out.println(this.model);
        System.out.println(this.speed);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Car mycar = new Car("포르쉐");
        Car yourcar = new Car("벤츠");

        mycar.run();
        yourcar.run();

    }
}