package day8.kitchen;

public class LotteBaseball {
    String City;
    String Grade;

    boolean Season;

    //생성자? : 클래스 이름과 같은 이름을 가진 메서드
    //객체가 생성될때 호출되어 객체의 초기 상태를 설정하는 특수한?
    //new 키워드와 함께 호출하면 새 객체를 생성하기 위한 메서드
    //일반 메서드랑은 다르게 반환값을 설정하지 않음

    public LotteBaseball(String city, String grade) {
        City = city;
        Grade = grade;
        Season = false;
    }

    //메서드
    void lotte1() {
        System.out.println("롯데 야구를 알려드립니다");
    }

    void lotte2() {
        System.out.println(City + "의 야구팀입니다");
    }

    void lotte3() {
        System.out.println("매년 시즌 전에 기대하다가 봄에 진짜 잘해서 더욱 기대함");
    }

    void lotte4() {
        System.out.println("여름부터 꼬라박고 " + Grade + "등으로 시즌종료함");
    }


    void end() {
        lotte1();
        lotte2();
        lotte3();
        lotte4();
        Season = true;
        System.out.println("終わった");
    }
}
