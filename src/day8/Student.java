package day8;

public class Student {
    //객체란 현실세계의 사물이나 개념을 프로그래밍적으로 표현한것 또는 그 표현을 코드로 구현한 생성된 실체(인스턴스)
    //필드 : 객체의 상태 (객체가 아는것)
    public String name; // 퍼블릭 써주면 데이9 스튜던트 파일에서 접근 가능
    int math;
    int eng;
    int kor;
    String pn;

    // 메서드 : 객체의 동작, 기능
    public void goschool() {
        System.out.println("학교에 갑니다...");
    }
}
