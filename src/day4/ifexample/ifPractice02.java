package day4.ifexample;
import java.util.Scanner;
public class ifPractice02 {
    public static void main(String[] args) {
        // 생년과 올해를 입력받으세요
        // 문제 1 : 태어난 해가 잘못된 값일경우 "태어난 해는 올해보다 이전이어야합니다"
        // 올바른값일경우 몇살 출력

        // 문제 2 : 태어난 해와 올해가 홀수인지 짝수인지
        // 문제 3 : 나이가 20세 이상인지
        // "태어난 해가 3의 배수이고 올해는 5의 배수가 아니다"
        // 조건문 만들기 ㅋ

        Scanner input = new Scanner(System.in);
        System.out.print("생년 : "); //
        int b = input.nextInt();
        System.out.print("올해 : "); //
        int y = input.nextInt();
        int KOR_age = (y - b) + 1;
        //문제 1
        if( b > y) {
            System.out.println("태어난 해는 올해보다 이전이어야 합니다");
        }
        else {
            System.out.println(KOR_age + "살 입니다");
        }
        System.out.println("-----------");

        //문제 2
        if ( b % 2 != 0) {
            System.out.println("태어난 해는 홀수입니다");
        }
        else {
            System.out.println("태어난 해는 짝수입니다");
        }
        if ( y % 2 != 0) {
            System.out.println("올해는 홀수입니다");
        }
        else {
            System.out.println("올해는 짝수입니다");
        }
        System.out.println("-----------");

        //문제 3
        if(KOR_age >= 20){
            System.out.println("20세 이상입니다");
        }
        else {
            System.out.println("20세 미만입니다");
        }
        // "태어난 해가 3의 배수이고 올해는 5의 배수가 아니다"

        if(b % 3 == 0) {
            System.out.printf("태어난 해는 3의 배수이고 ");
        }
        else {
            System.out.printf("태어난 해는 3의 배수가 아니고 ");
        }

        if (y % 5 == 0) {
            System.out.println("올해는 5의 배수이다");
        }
        else {
            System.out.println("올해는 5의 배수가 아니다");
        }


    }
}
