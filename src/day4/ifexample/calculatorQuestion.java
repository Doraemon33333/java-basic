package day4.ifexample;

import java.util.Scanner;
public class calculatorQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //문제 2
        while(true){

            System.out.print("첫번째 숫자 : ");
            float first_num = input.nextFloat();

            System.out.print("두번째 숫자 : ");
            float second_num = input.nextFloat();

            if (first_num == 0 && second_num == 0){
                break;
            }

            System.out.print("연산 기호를 입력하세요 : ");
            char sign = input.next().charAt(0);  //입력받은 문자열의 첫 번째 문자(인덱스 0에 해당하는 문자)를 추출

            double result;

            switch(sign){
                case '+' :
                    result = first_num + second_num;
                    System.out.printf("결과 : %.2f%n" , result);
                    break;                                          // -> break는 수행문을 빠져나오기 (없으면 계속 실행됨)
                case '-' :
                    result = first_num - second_num;
                    System.out.printf("결과 : %.2f%n" , result);
                    break;
                case '*' :
                    result = first_num * second_num;
                    System.out.printf("결과 : %.2f%n" , result);
                    break;

                case '/' :
                    if(second_num != 0){
                        result = first_num / second_num;
                        System.out.printf("결과 : %.2f%n", result);
                    }
                    else {
                        System.out.println("0으로 나눌수 없습니다");
                    }
                    break;

                default:
                    System.out.println("지원하지 않는 연산입니다");
            }
            System.out.println();

        }
    }
}
