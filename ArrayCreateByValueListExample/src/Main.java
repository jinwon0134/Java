import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] subjects = {"국어", "영어", "수학"};
        int sum = 0;

        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + " 점수를 입력하세요: ");
            int score = input.nextInt();
            sum += score;
        }

        double average = sum / 3.0;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f", average);

        input.close();
    }
}
