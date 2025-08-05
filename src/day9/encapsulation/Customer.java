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

    public void buyphone(PhoneStore store, String hosiiModel) {
        //고객이 들어옴 ㅋ
        System.out.println(name + " 님이 스토어에 입장하였습니다");

        // 고객이 휴대폰을 살 때 일어나는 일
        Phone phone = store.sellPhone(hosiiModel, budget);
        //phone.getModel();

        // 대리점이 휴대폰을 팔수 있냐 없냐를 구분하는 분기

        // 구입 했을때의 출력물
        // 구입 못 했을때의 ..


        if (phone != null) {
            System.out.println(name + " : " + phone.getModel() + " 구입 하겠습니다");
        } else {
            System.out.println(name + " : 다음에 다시 오겠습니다.");
        }

    }

}
