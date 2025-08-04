package day5;

public class WhileExample {
    public static void main(String[] args) {
        /*
        * 1. while 문
        * while (조건식){
        *    실행문; (중괄호 안에 있는 내용을 반복하시오)
        * }
        * 조건은 boolean값을 반환해야 하며 참을 반환하는 동안 실행문을 반복
        * 실행 내용은 중괄호 안에 드렁있음, while문의 중괄호 끝에는 세미콜론을 안씀
        *
        *
        *
        * */
        int num = 1;
        int sum = 0;        // 누산 결과를 담을 변수

        while (num <= 10){
            //조건부터 확인
            sum += num;
            num++;
        }
        System.out.println("합은 "+ sum + "입니다");
    }
}
