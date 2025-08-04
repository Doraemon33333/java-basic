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

    public void buyphone(PhoneStore store) {
        store.sellPhone();
        // 고객이 휴대폰을 살 때 일어나는 일

        // 대리점이 휴대폰을 팔수 있냐 없냐를 구분하는 분기

        // 구입 했을때의 출력물
        // 구입 못 했을때의 ..
        System.out.println("고객 : 핸드폰 구입이 완료되었습ㄴ");

    }
}
