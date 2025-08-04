package day4.ifexample;

public class ifExample01 {
    public static void main(String[] args) {
        //조건문
        /*
        * if (조건식) {
        *    조건식이 참을 반환할때 실행할 수행문(중괄호 안);
        * }
        * 조건은 논리 값을 반환하여야 한다
        *  -> 자바에서 조건식은 반드시 논리형의 데이터를 반환하는 식이어야 한다.
        *  (자바는 타입에 엄격한 언어이기 때문에 '참으로 평가되는 값' 이라는 개념이 없다 ㅋ)
        *  수행문은 중괄호로 묶어서 나타맴, 그부분을 블록이라함
        *
        *
        * */

        String name = "青木さん";
        int age = 7;
        if(age >= 8){                                  //if(false)  하면 출력안됨
            System.out.println(name + "は　학교에 갑니다");
        }
        else{
            System.out.println(name + "학교안감");
        }



    }
}
