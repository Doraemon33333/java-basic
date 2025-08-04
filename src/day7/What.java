package day7;

import java.util.Scanner;

public class What {
    static Scanner input = new Scanner(System.in); //스태틱은 객체를 생성하지않아도 부름

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println("1.윤년 계산기");
        System.out.println("2.BMI 계산기");
        System.out.println("3.사칙연산 계산기");
        System.out.println("4.누산값 계산기");
        System.out.println("5.나이 계산기");
        System.out.println("6.세과목 평균 및 총점 계산기");
        System.out.println("0.종료하기");

        while (true) {
            System.out.print("옵션 선택 하시오 : ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    return;          //return은 매서드를 종료하는 의미

                case 1:
                    leapYear(input);
                    break;

                case 2:
                    BMI(input);
                    break;

                case 3:
                    Calculator(input);
                    break;

                case 4:
                    addnumber(input);
                    break;

                case 5:
                    now_age(input);
                    break;
                case 6:
                    seiseki(input);
                    break;
            }
        }
    }


    public static void leapYear(Scanner input) {
        System.out.print("년도 입력 하세요 : "); //

        int a = input.nextInt();

        if (a % 400 == 0) {
            System.out.println(a + "년은 윤년 입니다");
        } else if (a % 100 == 0) {
            System.out.println(a + "년은 평년 입니다");
        } else if (a % 4 == 0) {
            System.out.println(a + "년은 윤년 입니다");
        } else {
            System.out.println(a + "년은 평년 입니다");
        }
        System.out.println();

    }

    public static void BMI(Scanner input) {
        System.out.print("체중을 입력하세요(kg) : ");
        float weight = input.nextFloat();

        System.out.print("신장을 입력하세요(cm) : ");
        float height = input.nextFloat();

        double BMI = weight / ((height / 100) * (height / 100));

        String your_weight;

        if (BMI < 18.5) {
            your_weight = "저체중";           // -> 한줄이면 중괄호 굳이 없어도 됨
        } else if (BMI < 23) {
            your_weight = "정상";
        } else if (BMI < 25) {
            your_weight = "과체중";
        } else {
            your_weight = "비만";
        }

        System.out.printf("당신의 BMI는 %.2f이며, '%s'입니다.", BMI, your_weight);
        System.out.println();
        System.out.println();

    }

    public static void Calculator(Scanner input) {
        System.out.print("첫번째 숫자 : ");
        float first_num = input.nextFloat();

        System.out.print("두번째 숫자 : ");
        float second_num = input.nextFloat();

        System.out.print("연산 기호를 입력하세요 : ");
        char sign = input.next().charAt(0);  //입력받은 문자열의 첫 번째 문자(인덱스 0에 해당하는 문자)를 추출

        double result;

        switch (sign) {
            case '+':
                result = first_num + second_num;
                System.out.printf("결과 : %.2f%n", result);
                break;                                          // -> break는 수행문을 빠져나오기 (없으면 계속 실행됨)
            case '-':
                result = first_num - second_num;
                System.out.printf("결과 : %.2f%n", result);
                break;
            case '*':
                result = first_num * second_num;
                System.out.printf("결과 : %.2f%n", result);
                break;

            case '/':
                if (second_num != 0) {
                    result = first_num / second_num;
                    System.out.printf("결과 : %.2f%n", result);
                } else {
                    System.out.println("0으로 나눌수 없습니다");
                }
                break;

            default:
                System.out.println("지원하지 않는 연산입니다");
        }
        System.out.println();
    }

    public static void addnumber(Scanner input) {
        int a = 1;
        int sum = 0;
        for (; a < a + 1; a++) {           // for문 가운데에 true 적어도 됨
            System.out.print("정수" + a + "입력 : ");
            int a2 = input.nextInt();

            sum += a2;
            if (a2 == 0) {
                break;
            }
        }
        System.out.println("합계는" + sum + "입니다");
        System.out.println();
    }

    public static void now_age(Scanner input) {
        System.out.print("생년 : "); //
        int b = input.nextInt();
        System.out.print("올해 : "); //
        int y = input.nextInt();
        int KOR_age = (y - b) + 1;
        //문제 1
        if (b > y) {
            System.out.println("태어난 해는 올해보다 이전이어야 합니다");
        } else {
            System.out.println(y + "년 기준 " + KOR_age + "살 입니다");
        }
        System.out.println();
    }

    public static void seiseki(Scanner input) {

        int[] score = new int[3];
        System.out.print("입력한 점수 : ");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
        }
        int result = score[0] + score[1] + score[2];
        double avarege = result / 3.0;

        System.out.printf("입력한 점수 : %d %d %d%n", score[0], score[1], score[2]);
        System.out.println("총점 : " + result);
        System.out.printf("평균 : %.2f%n", avarege);

        if (avarege >= 80) {
            System.out.println("등급 : 잘했어요");
        } else {
            System.out.println("등급 : 노력하세요");
        }

        System.out.println();

    }
}
