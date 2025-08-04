package day3;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        //금액을 입력받아 최소 화폐 갯수를 구한다
        /*
        *  금액 : 67340
        * 50000원 : 1
        * 10000원 : 1
        * 5000원 : 1
        * 1000원 2
        * 500원 : 0
        * 100원 : 3
        * 50원 : 0
        * 10원 : 4
        * 67340은 총 12개 필요
        * */
        Scanner input = new Scanner(System.in);
        System.out.print("금액 : ");
        int money = input.nextInt();  // 3693

        int a,b,c,d,e,f,g,h;
        a = money / 50000;
        b = (money % 50000) / 10000;
        c = (money % 10000) / 5000;
        d = (money % 5000) / 1000;
        e = (money % 1000) / 500;
        f = (money % 500) / 100;
        g = (money % 100) / 50;
        h = (money % 50) / 10;
        int add = a+b+c+d+e+f+g+h;
        System.out.printf("50000원 : %d%n",a );
        System.out.printf("10000원 : %d%n",b );
        System.out.printf("5000원 : %d%n",c);
        System.out.printf("1000원 : %d%n",d );
        System.out.printf("500원 : %d%n",e);
        System.out.printf("100원 : %d%n",f );
        System.out.printf("50원 : %d%n",g );
        System.out.printf("10원 : %d%n", h);
        System.out.printf("%d 원은 총 %d개 필요합니다%n", money,  add);
        String allmoney = money >= 1000000 ? "당신은 金持ちです" : "頑張ってください。。。";
        System.out.println(allmoney);

        // int = value, m5, m1,c5,c1,b5,b1,s5,s1, count; 처음에 count = 0;
        // m1  = value / 10000; , count += m1; , value %=10000
        // c5 = value / 5000; , count += c5; , value %=5000 뭐 이런 방법도 있다 라는





    }
}
