package day9.encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        // 휴대폰 공장에서 생산
        Phone iphone = new Phone("아이폰", 1000000);

        // 판매점 객체 생성 ... 단 한 기종만 판매가능....
        PhoneStore store = new PhoneStore(iphone);

        //손님
        Customer customer = new Customer("佐藤さん", 1000000);

        //손님이 구매를 한다.
        customer.buyphone(store);
    }


}
