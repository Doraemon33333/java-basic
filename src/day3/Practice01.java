package day3;

public class Practice01 {
    public static void main(String[] args) {
        /*
        * 예제 타수와 안타수를 변수에 저장하고 타율을 계산하세요
        * 타수 10 안타 1 타율 0.1
        * 결과예시 (타율이 0.345로 나왔을때)
        * > 3할 4푼 5리 이런식으로
        * */

        float bats = 397;
        float hits = 100;
        double bats_avg;
        bats_avg = (double) hits / bats;
        System.out.println(bats_avg = hits / bats);


        System.out.printf("%.3f%n", bats_avg);

        int avg2 = (int)Math.round(bats_avg *1000);

        int a,b,c;
        a = avg2 / 100;           // 할
        b = (avg2 % 100) / 10;    // 푼
        c = avg2 % 10;
        System.out.println(a + "할" + b + "푼" + c +"리");


        float bat = 55555;
        float hit = 9955;
        double bat_avg;
        bat_avg = (double) hit / bat;
        System.out.println(bat_avg = hit / bat);


        System.out.printf("%.3f%n", bat_avg);



        int h,p,l;
        h = (int)(bat_avg *10);
        p = (int)(bat_avg * 100) % 10;
        l = (int)(bat_avg *1000) % 10;
        System.out.printf("%d할%d푼%d리" , h, p, l);




















    }
}
