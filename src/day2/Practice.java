package day2;

public class Practice {
    public static void main(String[] args) {
        // 1. '희'라는  한글 글자의 유니코드 값을 찾아서 적절한 변수에 저장한 뒤 변수를 출력하여 확인하세요
        // 2. 본인 이름을 적절한 자료형의 변수에 담아 출력해보세요
        // 3. 출생년도를 저장하는 변수를 만들어 선언과 동시에 초기화하세요
        // 4, 바이트 타입의 변수 두개에 10과 20을 저장하고 바이트 타입의 새 변수에 두개 합한 결과 저장해보세요
        // 5. 태블릿소지여부를 변수에 저장하고 출력해보세요

        char no1 = '희';
        System.out.println((int)no1);   // 55148을 16진법으로 변경후 역슬래시u 써주면 유니코드 됨

        String no2 = "안성민";
        System.out.println(no2);

        int no3 = 2001;
        System.out.println(no3);
        System.out.println("출생년도는"+ no3 +"입니다");  // 문자열 연결하기 권법

        byte a1 = 10;
        byte a2 = 20;
        byte a3 = (byte)(a1 + a2); // 30인데도  이거는 int타입의 결과를 반환하는게 되어버려서 (byte) 필요함
        System.out.println(a3);

        boolean no5 = true;
        System.out.println("태블릿 갖고 있나요?" +  no5);
    }
}
