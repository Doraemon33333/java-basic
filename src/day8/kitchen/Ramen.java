package day8.kitchen;

public class Ramen {
    //필드  :  맴버 변수 생성
    public String noodleType;
    String soupType;
    boolean isCooked;

    //생성자? : 클래스 이름과 같은 이름을 가진 메서드
    //객체가 생성될때 호출되어 객체의 초기 상태를 설정하는 특수한?
    //new 키워드와 함께 호출하면 새 객체를 생성하기 위한 메서드
    //일반 메서드랑은 다르게 반환값을 설정하지 않음

    public Ramen() {
        // 기본 생성자(디폴트 생성자) : 생성자를 직접 만들지 않으면 자동으로 만들어준다.
        // 기본 생성자를 통해 만들어진 객체의 인스턴스 변수에는 각 타입의 기본값이 들어간다.
    }

    //생성자는 같은 이름으로 여러개 만들수 있다. -> 생성자 오버로드
    public Ramen(String rnoodleType, String rsoupType) {
        noodleType = rnoodleType;
        soupType = rsoupType;
        isCooked = false;  // 아직 cook을 실행되기 전이므로 false 해주는게 좋음
    }

    //메서드
    void boilWater() {
        System.out.println("물 끓이기");
    }

    void addNoodles() {
        System.out.println(noodleType + " 면을 넣습니다");
    }

    void addSoup() {
        if (soupType == "가루스프") {
            System.out.println("스프를 넣습니다");
        } else {
            System.out.println("물 버리고 액상스프 넣기");
        }
    }

    public void cook() {
        boilWater();
        addNoodles();
        addSoup();
        isCooked = true;
        System.out.println("終わった");
    }

    public boolean getisCooked() {
        return isCooked;
    }
}
