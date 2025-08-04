package day2;

public class DataType {
    // 데이터를 저장하는 공간의 크기는 바이트 단위 ww
    // 변수를 선언할때 데이터 타입을 정해야한다

    /*
    * 기본 자료형 (원시 자료형)
    * 정수형  byte(1), short(2), int(4), long(8)     -> ()안 숫자는 크기임 , 참고로 1바이트는 8비트임 처음에 int를 사용한 이유도 이거
    * 문자형  char(2)
    * 실수형  float(4) double(8)
    * 논리형  boolean(1)
    * 각 자료형을 담을수있는 데이터의 크기가 다름, 넘치면 오류남 ㅋ
    *
    * 참조 자료형( 나중에 해준대요)
    * 문자열을 저장하는 String -> 참조자료형에 속함! ("") 이 안에 무언가 넣어
    * 값을 저장하는 방식과 그 값에 접근하는 방식에서 차이가 남
    * 참조 자료형은 실제 데이터는 다른곳에 있고 그 위치가 어딘지를 변수에 저장하는방식
    * */

    public static void main(String[] args) {
        // 정수형 연습하기
        byte bVal = 20;
        // byte overByteVal = 128;  -> 128하면 안들어감요 ㅋ
        short sVal = 30;
        int iVal = 40;
        System.out.println(bVal + sVal + iVal);    // -> sout 치면 자동완성

        long lVal = 1234567890L;  // 숫자라는거 표시하려고 L 붙혀도됨

        // 문자형
        // 문자를 변수에 대입하면 문자 그대로 저장되는 것이 아니라 그 숫자에 해당하는 정수값(아스키코드) 저장됨
        char ch1 = 'A';
        // char ch1 = "A"; -> ""는 스트링임 이거는 작은따옴ㅍ
        System.out.println(ch1);
        System.out.println((int)ch1);  // -> (int)앞에 쓰면 A가 어쩌고 저쩌고 65가 나옴 (강제 형 변환)

        char ch2 = 66;
        System.out.println(ch2); // -> 이거 왜 B나옴? ㅋㅋ 아스키코드? 66은 B라네요

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);  // -> 위에는 67 밑에는 C

        char ch4 = '한';
        char ch5 = '\uD55c';  // 유니코드 뭐시기가 있다네요
        System.out.println(ch4);
        System.out.println(ch5); // 그래서 이것도 '한' 으로 나옴
        System.out.println((int)ch4); // 이거는 '한'의 아스키 코드 보는그거임

        // char ch6 = -65; -> 문자항에는 음수는 못한다 게이야

        boolean isStudent = true;
        System.out.println(isStudent);
         // System.out.println((int)isStudent); //불리언은 int로 못바꾸네요 논리형 <-> 정수형 교불

        // 실수형 함 보자
        double dNum = 3.141592;  // 이친구는 뒤에 d 써도 되고 안써도 되네?
        float fNum = 3.14f;  // 이런 float 뒤에는 f 나 F 써줘야함
        System.out.println(dNum);
        System.out.println(fNum);


        System.out.println(0.1 + 0.2); // ??????? -> 0과 1 로 소수점 아래의 숫자를 정확히 표현할수없기떄문, 따라서 오차가 생김

        // 컴퓨터의 2진수와 현시르이 10진수 각 표현방식의 차이로  인해 표현 가능한 값에 차이가 생기기 때문

        // 그냥 참조 해보셈
        String s1 = "hello";
        System.out.println(s1);

    }
}
