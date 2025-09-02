import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("단을 입력해 주세요 : ");
//        Integer.parseInt(input.nextLine());
//        int N = Integer.parseInt(input.nextLine());
//        for(int i=1; i<10; i++){
////            System.out.println("2 * " + i + " = " +  (i*2));
//            String str = String.format("%d * %d = %d",N, i, N*i);
//            System.out.println(str);
//        }
//
        for(int i=2; i<9; i++){
            for(int j=2; j<i; j++){
                String str2 = String.format("%d * %d = %d", i, j, i*j);
                System.out.println(str2);
            }
        }
    }

}