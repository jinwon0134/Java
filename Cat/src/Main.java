class Cat{
    String name;
    int age;
    String color;

    Cat(){

    }
    Cat(String name,int age){
        this.name=name;
        this.age=age;
    }
    Cat(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    String Meow(){
        return ("야옹");
    }
    String Eat(){
        return ("냠냠");
    }
}
public class Main {
    public static void main(String[] args) {//TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
       Cat badok = new Cat("바둑이", 10);
       System.out.println("고양이의 이름은: " + badok.name + "고양이의 나이는: " + badok.age);

       Cat nayeong = new Cat("냐옹이", 10, "white");
        System.out.println("고양이의 이름은: " + nayeong.name + "고양이의 나이는: " + nayeong.age + "고양이의 색깔은: " + nayeong.color);
    }
}