import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        String strValue;
        Scanner input = new Scanner(System.in);
        System.out.print("문자열을 1개 입력하세요: ");
        strValue = input.next();

        switch (strValue) {
            case "A":
                System.out.println("A를 입력하셨습니다.");
                break;
            case "B":
                System.out.println("B를 입력하셨습니다.");
                break;
            case "C":
                System.out.println("C를 입력하셨습니다.");
                break;

        }
    }
}