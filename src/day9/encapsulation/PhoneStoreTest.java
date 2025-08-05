package day9.encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        // 휴대폰 공장에서 생산
        Phone iphone = new Phone("아이폰", 1000000);
        //Phone galaxy = new Phone("갤럭시?", 1000000);
        // 판매점 객체 생성 ... 단 한 기종만 판매가능....(취소)
        PhoneStore store = new PhoneStore(iphone);
        //PhoneStore store2 = new PhoneStore(galaxy);

        //손님
        Customer customer = new Customer("佐藤さん(아이폰 원함)", 1500000);
        

        //손님이 구매를 한다.
        customer.buyphone(store);
        System.out.println();
    }


}
