package day4.ifexample;
import java.util.Scanner;
public class ifPractice01 {
    public static void main(String[] args) {
        // 시험점수를 정수로 입력받습니다 ( 0~100점)
        /*
        * 합격입니다 / 불합격입니다 (80 기준)
        * 90점이상 A
        * 80점이상 B
        * 70점이상 C
        * 60점이상 D
        * 그밑에 F
        * 범위 밖 : 입력오류
        * */
        Scanner input = new Scanner(System.in);
        System.out.print("점수 : "); // print 뒤에 ln 안쓰면 줄바꿈 안생김
        int a = input.nextInt();

        if (a > 100) {
            System.out.println("입력오류");
        }

        else if ( a >= 90) {
            System.out.println("합격입니다" + " A");
        }
        else if (a >= 80 ) {
            System.out.println("합격입니다" + " B");
        }
        else if (a >= 70 ) {
            System.out.println("불합격입니다" + " C");
        }
        else if (a >= 60) {
            System.out.println("불합격입니다" + " D");
        }
        else if (a>=0) {
            System.out.println("불합격입니다" + " F");
        }
        else {
            System.out.println("입력오류");
        }
    }
}
