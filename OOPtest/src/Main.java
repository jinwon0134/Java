import java.util.Scanner;

class Car {
    String brand;
    int speed;
    String color;

    // 기본 생성자
    Car() {
    }

    // 매개변수 있는 생성자
    Car(String brand, int speed, String color) {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }

    public void Run() {
        System.out.println("차가 달린다!!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        System.out.println(myCar1.speed); // 0 출력 (기본값)

        Car myCar2 = new Car("현대", 240, "하얀색"); // 올바른 생성자 호출
        System.out.println(myCar2.speed); // 240 출력
        myCar2.Run(); // "차가 달린다!!" 출력
    }
}

