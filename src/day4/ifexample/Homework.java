package day4.ifexample;

import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int height, weight;
        //double height_m, bmi =0;   // 미리 0을 넣어놓고 작성해나감
        // String result = "";

        //입력 받기
        //BMI식에 맞춰서 연산, 연산 결과에 따른 result 값 구분 (조건문)


        // System.out.printf("당신의 BMI는 %.2f이며, '%s'입니다", bmi, result);

        // -------

        int a, b;
        double result_2;
        String operator = input.next();
        operator = "+++";
        switch (operator) {
            case "+" :
                System.out.printf("");
                break;
            default:
                break;
        }




        //문제 2
        System.out.print("첫번째 숫자 : ");
        int first_num = input.nextInt();

        System.out.print("두번째 숫자 : ");
        int second_num = input.nextInt();

        System.out.print("연산 기호를 입력하세요 : ");
        char sign = input.next().charAt(0);  //입력받은 문자열의 첫 번째 문자(인덱스 0에 해당하는 문자)를 추출

        double result;

        switch(sign) {
            case '+':
                result = first_num + second_num;
                System.out.printf("결과 : %.0f%n", result);
                break;
            case '-':
                result = first_num - second_num;
                System.out.printf("결과 : %.0f%n", result);
                break;
            case '*':
                result = first_num * second_num;
                System.out.printf("결과 : %.0f%n", result);
                break;

            case '/':
                if (second_num != 0) {
                    result = (double) first_num / second_num;
                    System.out.printf("결과 : %.2f%n", result);
                } else {
                    System.out.println("0으로 나눌수 없습니다");
                }
                break;

            default:
                System.out.println("지원하지 않는 연산입니다");
        }

    }
}
