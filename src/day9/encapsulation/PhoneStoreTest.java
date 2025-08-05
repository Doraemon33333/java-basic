package day9.encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        // 휴대폰 공장에서 생산
        Phone iphone = new Phone("아이폰", 1000000);
        Phone galaxy = new Phone("갤럭시", 800000);
        // 판매점 객체 생성 ... 단 한 기종만 판매가능....(취소)
        PhoneStore iphonestore = new PhoneStore(iphone);
        PhoneStore galaxystore = new PhoneStore(galaxy);

        //손님
        Customer customer = new Customer("佐藤さん(아이폰 원함)", 1500000);
        Customer customer2 = new Customer("青木さん(아이폰 원함)", 500000);
        Customer customer3 = new Customer("松本さん(갤럭시 원함)", 2000000);

        //손님이 구매를 한다.
        customer.buyphone(iphonestore, "아이폰");
        System.out.println();
        customer.buyphone(galaxystore, "아이폰");
        System.out.println();

        customer2.buyphone(iphonestore, "아이폰");
        System.out.println();

        customer3.buyphone(iphonestore, "갤럭시");
        System.out.println();
        customer3.buyphone(galaxystore, "갤럭시");
    }


}
