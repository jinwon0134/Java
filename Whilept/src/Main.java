import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: 대문자 출력, 2: 소문자 출력");
        System.out.println("숫자를 입력하세요: ");
        int a = sc.nextInt();

        if(a == 1){
            for(char i='A'; i <='Z';i++){
                System.out.println(i + " ");
            }
        }
        else if(a == 2){
            for(char i='a'; i <='z';i++){
                System.out.println(i+ " ");
            }
        }
        else{
            System.out.println("숫자를 다시 입력하세요");
        }

    }
}