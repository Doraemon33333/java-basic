package day9;

import day8.kitchen.Ramen;

public class AccessModifierTest {
    // 접근 제어자
    // public default private protected   ->
    // public : 외부 클래스 어디에서나 접근 가능
    // default(공란) : 같은 패키지 내부의 클래스에서만 접근 가능
    // 접근 제어자를 쓰는 위치에 아무것도 안 쓴 상태
    // protected : 같은 패키지 내부와 상속관계인 클래스에서만 접근가능, 그 외 클래스는 접근 할 수 없음
    // private : 같은 클래스 내부에서만 접근 할수있다.
    public static void main(String[] args) {  // Ramen 에서 퍼블릭으로 해줘야함
        Ramen ramen = new Ramen("너구리", "가루스프");
        boolean flag = ramen.getisCooked();

        printStatus(ramen);
        ramen.cook(); // 이것도 퍼블릭으로 바꿔줘야 호출가능
        printStatus(ramen); //얘는 같은클래스 밑에 있으느 퍼블릭 없어도됨

        flag = ramen.getisCooked();
        if (flag) {
            System.out.println("새로 생성된 라면 인스턴스 " + ramen.noodleType + "는 조리된 상태 ");
        } else {
            System.out.println("새로 생성된 라면 인스턴스 " + ramen.noodleType + "는 조리가 덜 된 상태 ");
        }

    }

    public static void printStatus(Ramen ram) {
        boolean flag = ram.getisCooked();
        if (flag) {
            System.out.println("새로 생성된 라면 인스턴스 " + ram.noodleType + "는 조리된 상태 ");
        } else {
            System.out.println("새로 생성된 라면 인스턴스 " + ram.noodleType + "는 조리가 덜 된 상태 ");
        }
    }

}
