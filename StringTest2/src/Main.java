//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        String str1 ="자바 프로그래밍";
        String newStr = str1.replace("자바", "Java");
        System.out.println("문자열 길이: " + str1.length());
        for(int i=0;i<8;i++){
            System.out.print(str1.charAt(i));
        }
        String str3 = "991225-1234567";
        System.out.println(str3.substring(2));
        System.out.println(str3.substring(2,6));
    }
}