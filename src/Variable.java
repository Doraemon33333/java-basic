public class Variable {
    public static void main(String[] args) {

        // 변수? 값을 담는 상자
        // 값이란? 메모리에 저장된 데이터 조각
        // main , ctrl + space 해서 자동완성
        int num;             // 정수형 변수 num  선언
        num = 100;           // 100을 num 에  집어넣기(대입, 할당)
        System.out.println(num);     // "" 안에 쓰면 문자열이 됨

        int num2 = 200; // 변수 선언과 동시에 값 대입
        System.out.println(num2);
        // 변수를 준비해서 처음으로 값을 넣는것 --> 변수 초기화

        num = 300;
        System.out.println(num);  // 오잉 100 안사라지네

        // 변수 이름 규칙
        // 영문자나 숫자 사용 특수문자는 $,_ 사용 가능
        // 숫자로 시작할수 없음 ㅋ
        // 예약어 사용 불가능 -> 예약어(주황색글씨? int , static 이런거)

        // ex) int $_var%iable = 100;
        // ex) int 1234var = 100;    -> 이런식으로 못씀 ㅋ


    }
}
