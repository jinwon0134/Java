import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //Q. 가로 (width), 세로 (height)를 입력받아 삼각형 넓이 (Area)를 구하는
        //프로그램을 작성하시요.
        int width, height;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("width : ");

        width = sc.nextInt();
        System.out.println("height : ");
        height = sc.nextInt();
        area = (width * height) / 2.0;
        System.out.println(area);

    }
}