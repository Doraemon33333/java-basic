package day2;

public class Constant {
    public static void main(String[] args) {

        // 상수
        // 변하지 않는 값을 저장하기 위함

        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        // MIN_NUM = -99;  -> 안됨 , 최초 한번의 대입만 가능함(변경불가)



    }
}
