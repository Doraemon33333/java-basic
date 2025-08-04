package day6;
import java.util.Scanner;

public class LoopPractice03 {
    public static void main(String[] args) {
        //정수를 입력받아(반복문 안에서)합계를 구한다
        //입력받은 정수가 0이면 무조건 종료한다
        // for while do-while 3가지 버전으로

        //매개변수 parameter, 인자 argument

        Scanner input = new Scanner(System.in);

        int a = 1;
        int sum = 0;
        for (  ; a < a+1 ; a++) {           // for문 가운데에 true 적어도 됨
            System.out.print("정수" + a + "입력 : ");
            int a2 = input.nextInt();

            sum += a2;
            if(a2 == 0){
                break;
            }
        }
        System.out.println("합계는"+ sum + "입니다");

        /*System.out.println("---------------------");

        int b = 0;
        int sum2 = 0;

        while (b <= 1000000000){     //true 사용 가능
            b++;
            System.out.print("정수" + b + "입력 : ");
            int b2 = input.nextInt();

            sum2 += b2;

            if(b2 == 0){
                break;
            }
        }
        System.out.println("합은 "+ sum2 + "입니다");

        int c = 0;
        int sum3 = 0;

        do{
            c++;
            System.out.print("정수" + c + "입력 : ");
            int c2 = input.nextInt();

            sum3 += c2;
            if(c2 == 0) {
                break;
            }

        } while(c <= 100000000);

        System.out.println("합은 "+ sum3 + "입니다"); */

    }
}
