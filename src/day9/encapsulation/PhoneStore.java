package day9.encapsulation;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;

    }

    // 대리점이 휴대폰을 파는 동작/메서드
    public Phone sellPhone() {
        // 대리점이 휴대폰을 판매
        return phone;
    }

    private void registerPatment() {
        System.out.println("대리점 : 요금제를 등록합니다. 그리고 약정을 등록");
    }

    private void discountPromotion() {
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다");

    }
}

