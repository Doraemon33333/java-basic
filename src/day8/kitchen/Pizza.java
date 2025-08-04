package day8.kitchen;

public class Pizza {
    String pizzaType;
    String pizzaSize;
    String goingOven;
    boolean isCooked;


    //생성자? : 클래스 이름과 같은 이름을 가진 메서드
    //객체가 생성될때 호출되어 객체의 초기 상태를 설정하는 특수한?
    //new 키워드와 함께 호출하면 새 객체를 생성하기 위한 메서드
    //일반 메서드랑은 다르게 반환값을 설정하지 않음

    public Pizza(String pizza_Type, String pizza_Size, String going_Oven) {
        this.pizzaType = pizza_Type;
        this.pizzaSize = pizza_Size;
        this.goingOven = going_Oven;
        isCooked = false;
    }

    //메서드
    void dou() {
        System.out.println("도우를 반죽하세요");
    }

    void pizzaSize() {
        if (pizzaSize == "L") {
            System.out.println("피자 크기 " + pizzaSize);
        }
        if (pizzaSize == "M") {
            System.out.println("피자 크기 " + pizzaSize);
        }

        if (pizzaSize == "S") {
            System.out.println("피자 크기 " + pizzaSize);
        }

    }

    void pizzaSource() {
        System.out.println(pizzaType + " 사용해서 반죽한 도우에 넣어주세요 ");
    }

    void goingOven() {
        System.out.println(goingOven + "분 동안 오븐에 굽습니다");
    }

    void end() {
        System.out.println("조리가 완료 되었습니까? " + isCooked);
    }


    void cook() {
        dou();
        pizzaSize();
        pizzaSource();
        goingOven();
        isCooked = true;
        end();
        System.out.println("終わった");
    }
}


