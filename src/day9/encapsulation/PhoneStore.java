package day9.encapsulation;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }


    /**
     * 대리점이 휴대폰을 파는 동작/메서드
     * 요금제를 등록하고 regi---
     * 할인을 적용하고 discount---
     * 휴대폰 전달 return
     * TODO: 모델명과 예산을 파라미터로 받아서 구입가능여부를 확인후 반환값을 전달
     * <p>
     * <p>
     * //@param model, budget
     *
     * @return
     */


    public Phone sellPhone(String hosiiModel, double budget) {
        if (phone.getModel().equals(hosiiModel) && budget >= phone.getPrice()) {
            System.out.println("대리점: 판매 가능합니다");
            registerPayment();
            discountPromotion();
            return phone;
        } else {
            if (budget <= phone.getPrice()) {
                System.out.println("대리점: 예산이 부족하여 판매 불가 합니다");
                return null;
            } else {
                System.out.println("대리점 : 원하는 모델이 없습니다");
                return null;
            }

        }

        // 대리점이 휴대폰을 판매할때 일어나는일


        /*if (budget > phone.getPrice()) {
            System.out.println("예산이 충분합니다");
        } else {
            System.out.println("돈이 부족하네요");
        }*/

        //System.out.println("(사실 이분 부자라서 가격 신경안씀) ");

    }

    private void registerPayment() {
        System.out.println("대리점 : 요금제를 등록합니다. 그리고 약정을 등록");
    }

    private void discountPromotion() {
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다");

    }


}

