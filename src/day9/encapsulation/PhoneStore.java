package day9.encapsulation;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;

    }

    private void registerPatment() {
        System.out.println("대리점 : 요금제를 등록합니다. 그리고 약정을 등록");
    }

    private void discountPromotion() {
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다");

    }
}

