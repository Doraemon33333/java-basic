package day13and14;

public class Dgsdgheh {
    public static void main(String[] args) {

        int a, b, c;


        a = 1;
        b = 2;

        c = ++a + b;
        System.out.println(a + ", " + b + ", " + c); // a = 1, b = 2 (초기값) -> ++a 해서 a = 2됨


        // a++면 a = 1(초기값) + b=2 계산 후 a 1증가




        boolean res = a++ < 0 && b++ > 0;  // &&는 앞에서 부터 거짓이면 뒤에껀 보지도않기 때문에  앞에서 거짓이면 b++ 실행 안됨
        // 만약 & 하나만 쓴다면 조건을 끝까지 봄
        // 사실 a < 0 && b > 0 쓰고 밑에 a++, b++ 하는게 일반적임
        System.out.println(a + ", " + b + ", " + res);

        double d = (double) 10 / 3;
        System.out.println(d);

        c = a + b + 1 + 2;
        c = b = a = 1;  // 이런 경우는 a부터 실행됨

        a = 3;
        c = a << 2;
        System.out.println(c);

        a = 9;
        b = 3;
        c = a & b;
        System.out.println(c);


    }
}
