package day7;

public class FunctionTest {

    // 함수?  하나의 기능을 수행하는 코드 덩어리
    // 한 작업을 여러번 반복한다면 함수로 만들어두고 필요할때마다 호출해서 쓸수있음
    // 전달할 때, 전달 받을 때는 매서드 선언할때 지정된 대로(타입, 순서).
    /*
     * 함수로 분리하는 것의 장점
     *  - 가독성 향상
     *  - 재사용성 증가, 중복 코드 제거
     *  - 유지 보수 용이성
     *  - 테스트 용이성
     *  - 의도 명확화
     *
     * */

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result = addNum(num1, num2);    //함수 호출 ㅋ
        System.out.println(result);
        System.out.println(addNum(30, 80));
    }


    //     /** 엔터 하면 신기한거 나옴 (javadoc 주석)
    // 주석 블록 안에서 특별한 태그를 사용해 문서화

    /**
     * @param a 첫번째 항
     * @param b 두번쨰 항
     * @return 결과값
     */
    public static int addNum(int a, int b) {

        int result = a + b;
        return result; // 리턴 숫자 하나 찍어야함
    }
}
