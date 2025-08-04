package day6;

public class NestedLoop {
    public static void main(String[] args) {

        int i = 2;

        for (   ; i <= 9; i++) {   // 2단부터 9단까지

            int j = 1;
            for (    ; j <= 9 ; j++) {    // 각각 1부터 9까지 곱하기
                System.out.println( i + "x" + j +"=" + i*j);
            }
            System.out.println("---------------");  // 각 단 사이 구분
        }
    }
}
