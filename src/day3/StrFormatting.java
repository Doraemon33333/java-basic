package day3;

public class StrFormatting {
    public static void main(String[] args) {
        //문자열 포멧팅
        // System.out.printf()
        // 서식 지정자
        /* %d 정수 ,
         * %f 실수
         * %s 문자열
         * %n 줄바꿈
         * %x / %X 16진수(소문자/대문자)
         */
        double d = 123.45678;
        int n = 1234;
        String name = "호날두";
        System.out.printf("이름은 %s입니다.%n", name); //name을 %s에 넣기 ㅋ
        System.out.printf("이름은 %5s입니다.%n", name); // %n은 줄바꿈 5는 그 name 앞에 뭐가 5칸(오른쪽정렬)
        System.out.printf("이름은 %-5s입니다.%n", name); // 왼쪽w정렬

        //정수
        System.out.printf("기본출력 %d.%n", n);
        System.out.printf("오른쪽 정렬 %10d:%n", n);
        System.out.printf("왼쪽 정렬 %-10d:%n", n);
        System.out.printf("오른쪽 정렬 %010d:%n", n);  // 0으로 채우기 (왼쪽은 안됨)

        System.out.printf("실수값 포맷팅 %f %n", d);
        System.out.printf("실수값 포맷팅 %.2f %n", d); //소수점 2자리 까지
        System.out.printf("실수값 포맷팅 %10.2f %n", d);
        System.out.printf("실수값 포맷팅 %-10.2f: %n", d);
        System.out.printf("실수값 포맷팅 %010.2f %n", d); //빈자리 0채우기

        int age = 500;
        String myname = "안성민";
        System.out.printf("이름 : %s, 나이 : %d", myname, age );







    }
}
