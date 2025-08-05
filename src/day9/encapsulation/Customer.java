package day9.encapsulation;

public class Customer {
    private String name;
    private double budget;

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    /**
     * 고객이 휴대폰을 사는 동작
     * 대리점 객체가 휴대폰을 파는 메서드를 호출
     * TODO: 고객이 구입하려는 휴대폰 기종과 대리점이 취급하는 기종의 일치여부를 확인
     *
     * @param store
     */

    public void buyphone(PhoneStore store) {
        //고객이 들어옴 ㅋ
        System.out.println(name + " 님이 스토어에 입장하였습니다");

        // 고객이 휴대폰을 살 때 일어나는 일
        Phone phone = store.sellPhone("아이폰 ", budget);
        //phone.getModel();

        // 대리점이 휴대폰을 팔수 있냐 없냐를 구분하는 분기

        // 구입 했을때의 출력물
        // 구입 못 했을때의 ..


        if (phone.getModel() == "아이폰") {
            System.out.println("고객 : 핸드폰 " + phone.getModel() + " 구입이 완료되었습ㄴ");
        } else {
            System.out.println("고객 : 원하는 핸드폰이 아니므로 다음에 사겠습니다");
        }

    }
    // store에서 폰을 사는 함수
    /*public void buyphone(PhoneStore store){
        // store에는 폰이 존재합니다.
        // 매장에 폰이 있는지 물어봅니다.
        // 매장에 폰이 있는지 확인하는 함수
        // findPhone(store); --> store에서 phone이 있으면 폰을 주고 없으면 null을 줍니다.
        // sellPhone();

    }*/




    /*public void buyphone2(PhoneStore store2) {
        System.out.println(name + " 님이 스토어에 입장하였습니다");

        // 고객이 휴대폰을 살 때 일어나는 일
        Phone phone = store2.sellPhone("갤럭시?", budget);
        phone.getModel();
        if (phone.getModel() == "아이폰") {
            System.out.println("고객 : 핸드폰 " + phone.getModel() + " 구입이 완료되었습ㄴ");
        } else {
            System.out.println("고객 : 원하는 핸드폰이 아니므로 다음에 사겠습니다");
        }

    }*/
}
