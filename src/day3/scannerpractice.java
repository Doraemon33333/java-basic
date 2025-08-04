package day3;
import java.util.Scanner;
public class scannerpractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("타수 입력 하세요 : "); // print 뒤에 ln 안쓰면 줄바꿈 안생김
        int bat = input.nextInt();    // 엔터 누르면 줄바꿈 발생하는 느낌
        System.out.print("안타수 입력 하세요 : ");
        int hit = input.nextInt();

        double bat_avg;
        bat_avg = (double) hit / bat;
        System.out.printf("타율 : %.5f%n", bat_avg);

        int bat_avg2 = (int)Math.round(bat_avg * 1000); // ex) 367.666 -> 368

        int h,p,l;
        h = (bat_avg2 /100);
        p = (bat_avg2 % 100) / 10;
        l = (bat_avg2 % 10);
        System.out.printf("%d할%d푼%d리%n" , h, p, l);





    }

}
