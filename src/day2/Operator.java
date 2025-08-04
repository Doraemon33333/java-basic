package day2;

public class Operator {
    public static void main(String[] args) {
        // 연산자 ?? 연산에 사용허는 기호
        // 항?? 연산에 사용하는 값

        //연산자의 종류
        /*
         * 1. 대입연산자 ( 오른쪽 항에 있는 값을 왼쪽 항에 대입), 왼쪽에는 변수나 상수가 와야함
         * 1..........복합대입연산자
         * 2. 산술연산자 : 사칙연산과 나머지 연산 (+,-,*,/,%)
         * 3. 증감연산자 : ++, --
         * 4. 관계연산자
         * 5. 논리연산자 and(&&) -> 둘다 참이여야 T or(||) not(!)
         * 6. 비트연산자 (이건안함ㅋ)
         * 7. 조건연산자 (삼항연산자)
         * 8. 인스턴스 연산자
         * 9. 형변환 연산자
         * */


        // 산술 연산자
        int mathScore = 50;
        int engScore = 61;
        int totalScore = mathScore + engScore;
        System.out.println(totalScore);

        double avgScore = totalScore / (float) 2; // 아니면 2.0 으로 나눠도됨
        System.out.println(avgScore);

        System.out.println(5 * 3);
        System.out.println(5 - 3 * 2);
        System.out.println(5 % 2); // 나머지

        //증감연산자
        int gameScore = 150;
        int lastScore = ++gameScore;
        System.out.println(lastScore);
        System.out.println(gameScore);  // 이거도 151됨 ㅋ
        System.out.println(lastScore++); // 뒤에 ++ 붙이기 : 출력 먼저하고 증감하기 결과는 151
        System.out.println(++lastScore); // 즉 여기서는 아까 위에서 더한거 + 여기서 더한거 원래보다 2가 더해져서 나옴 고로 153

        // 관계 연산자
        System.out.println(1 > 3); // 뭐 이런식으로 T,F 출력하는거 같음
        System.out.println(1 < 3);
        System.out.println(1 >= 3); // 항상 부등호 먼저 <= 이런식으로
        System.out.println(1 <= 3);
        System.out.println(1 == 3); // == 2개 쓰기
        System.out.println(1 != 3); // != 는 같지않다 라는 뜻


        System.out.println("--------------7/3");
        // 논리 연산자
        // and 연산자 (논리 곱) : 둘 다 참일때 참
        // or 연산자 (논리 합) : 둘중에 하나라도 참이면 참
        // ! 연산자 (부정) : 단항연산자 논리형 값을 반대의 값으로 바꿈
        int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag); // 둘다 참이니까 T

        flag = (num1 > 0) && (num2 < 0);
        System.out.println(flag); // F

        flag = (num1 > 0) || (num2 < 0);
        System.out.println(flag); // 둘중 하나 참이니까 T

        flag = (num1 < 0) || (num2 < 0);
        System.out.println(flag);

        System.out.println(!flag);  // 위에까지 F였는데 T로 나옴 재대입이 일어나고 그런건 아님
        System.out.println(flag);

        System.out.println("--------");

        int i = 2;
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // &&에서 앞에서 이미 거짓이면 뒤에는 실행안됨
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); // 고로 여기서 2가 그대로 나옴( 실행이 안되기 때문)

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // ||에서 앞에서 이미 참이면 결과가 이미 참이라 뒤에는 실행안됨
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        System.out.println("----------");

        // 조건(삼항 연산자)
        // 조건문 ? (참일때 이거 출력) : (거짓일때 이거 출력)
        System.out.println((5 > 3) ? "Siuuu" : "hummmm..");

        int fatherage = 45;
        int motherage = 47;
        String result;
        result = (fatherage > motherage) ? "아빠가 나이 많음" : "엄마가 나이 많음";
        System.out.println(result);

        System.out.println("-----------");
        //복합대입 연산자
        // 연산자 좌항에서 우항의 값을 ~~~해서 좌항에 대입하세요
        System.out.println(i);    // 여기까지 i는 2인 상태
        i = i + 2;
        i += 2;
        System.out.println(i);
        num1 -= 1;               // 위에서 어딘가에 num1이 30이었나봄 1빼서 29로 나옴
        num1 *= 2;          // 여기까지 58되고
        num1 /= 10;         // 여기서 10나누고 몫 5이므로 여까지 5
        num1 %= 2;     // 나머지 1이므로 1출력
        System.out.println(num1);

       /*int result1 = num1 + 10;
        int result2 = i + 2;
        value = ( result1 < 10) && ( result2 < 2);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); */
    }
}
