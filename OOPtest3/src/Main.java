//설계도
class Car{
    //1. 멤버 변수
    String brand;
    int speed;
    String color;
    public void run(){
        System.out.println("차가 달리다.");
    }
    //2. 생성자
    Car(){}//default생성자
    Car(String brand){
        this.brand = brand;
    }
    Car(String brand, int speed){
        this.speed = speed;
        this.brand = brand;
    }

    //3. 멤버 메소드
}
public class Main {
    public static void main(String[] args) {
       Car dori = new Car();
       dori.run();
       System.out.println("자동차이름: " + dori.brand);
       Car myCar = new Car();
       myCar.run();
        System.out.println(" 자동차 스피드: " +myCar.speed);
        System.out.println("자동차 브랜드: " + myCar.brand);
    }
}