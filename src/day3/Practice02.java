package day3;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        * 초단위의 숫자를 입력받아 시간, 분, 초 단위로 환산한다
        *
        * 초 단위를 입력하세요 : 3693
        * 1시간 0분 6초
        *
        * */

        Scanner input = new Scanner(System.in);
        System.out.print("초 단위 입력 하세요 : ");
        int sec = input.nextInt();  // 3693

        int h,m,s;
        h = sec / 3600;
        m = (sec % 3600) / 60;
        s = (sec % 60);
        System.out.printf("%d시간 %d분 %d초", h, m, s );


    }
}
