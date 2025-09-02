class Car {
    String color;
    String price;
    String type;
    Car(){
        this.color = "red";
        this.price = "500";
        this.type = "람보르기니";
    }

    Car(String type, String price, String color){
        this.color = color;
        this.price = price;
        this.type = type;
    }

    String run(){
        return "매우 빠름";
    }
    String speed(){
        return "시속 300km";
    }

}
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Car rambo = new Car("람보르기니", "3,000,000,000", "white");
        System.out.println("자동차 종류 : " + rambo.type);
        System.out.println("가격 : " + rambo.price);
        System.out.println("색깔 : " + rambo.color);

        System.out.println(rambo.run());
        System.out.println(rambo.speed());
    }
}