//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String str = "10";
        byte value = Byte.parseByte(str);
        System.out.println(value);

        String str2 = "200";
        short value2 = Short.parseShort(str2);
        System.out.println(value2);

        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        String strVar3 = new String("홍길동");

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1 == strVar3);
        System.out.println(); //한줄 띄우기

        //java에서 문자열의 내용이 중요할 때 같은지 다른지 비교
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));
    }
}