import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요: ");
        a = sc.nextInt();
        switch (a) {
            case 0:
                System.out.println("일요일" + "입니다.");
            case 1:
                System.out.println("월요일" + "입니다.");
                break;
            case 2:
                System.out.println("화요일" + "입니다.");
                break;
            case 3:
                System.out.println("수요일" + "입니다.");
                break;
            case 4:
                System.out.println("목요일" + "입니다.");
                break;
            case 5:
                System.out.println("금요일" + "입니다.");
                break;
            case 6:
                System.out.println("토요일" + "입니다.");
                break;
        }
    }
}