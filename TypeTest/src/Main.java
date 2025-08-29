//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        boolean bool = true;
        byte b1 = 127;
        int i1 = Integer.MAX_VALUE;
        System.out.println(bool);

        String s1 = "안녕하세요.";
        byte b2 =1;
        int i2 =2;
        double d2 = b2+i2; //자동 타입변환
        b2 = (byte) ((byte)i2 +(byte)d2);

        i2 = (int)d2;
    }
}