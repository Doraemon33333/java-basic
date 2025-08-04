package day5;

public class ForExample {
    public static void main(String[] args) {
        /*
        * 3. for문
        * for(초기화식; 조건식; 증감식){
        *    수행문;
        * }
        *
        * */

        int sum = 0;    // sum을 반복문 전에 지정해줘야함
        int i = 0;           // 여따가 쓰면 for문에 초기화식 생략
        // ctrl + space 자동완성?
        for (   ; ; i++) {
            sum += i;

            System.out.println(i + "회차 반복");
            System.out.println(sum);
            // 여기다가 i++ 를 쓸수 있다는 거임 for문에 생략하고
            System.out.println("------------");

            // 여기 조건을 써서 for문에 조건문 생략 가능하고, 중간에 멈추기도 가능
            if ( i >= 5 ){
                // break로 반복문 자체를 빠져나가도록 함
                break;
            }
        }

        System.out.println("반복문을 나온 시점에 i는 "+ i +"이고, 합은 "+ sum + "입니다");

        // for 문  괄호 안의 세 요소는 생략 가능함
        /*
        * 초기화식 : 반복 전에 이미 초기화된 변수를 사용하는 경우 생략 가능 ex) int i = 0 을 밖에다 쓰고 for문 안에 안써도 된다는거
        * 조건식 : 반복을 중간에 멈추고자 할 때, 조건을 블록 내의 제어문을 추가하여 처리하면 조건식을 생략 할 수 있다.
        * 증감식 : 증감식이 복잡하거나 다른 변수의 상태에 따라 달라질 경우 증감 처리를 블록 안에서 직접 수행 가능
        * */
    }
}
