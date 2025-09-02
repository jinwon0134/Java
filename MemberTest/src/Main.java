class Member{
    final public void run(){
     //메소드의 final붙이면 재정의 불가
    }
}

class VIP extends Member{
    //멤버 선언과 동시에 초기화
    public int number = 100;

    public void test(){
        number = 200;
    }
}

public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[3];

    }
}