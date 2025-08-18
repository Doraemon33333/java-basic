package day15;

public class MathTest {
    public static void main(String[] args) {
        // 2의 10승 1024
        double res = 1;
        int a = 2;
        int b = 10;


        for (int i = 1; i <= b; i++) {
            res *= a;

        }
        System.out.println(a + "의" + b + "승 = " + res);

        res = Math.pow(a, b);
        System.out.println(res);
        System.out.println();

        //Math m = new Math(); -> 만들지 못하는 것임 (Math)

        System.out.println(Math.sqrt(2)); // 제곱근
        System.out.println(Math.abs(-3)); // 절대값
        System.out.println(Math.round(2.33)); // 반올림
        System.out.println(Math.floor(2.33)); // 이친구는 내림
        System.out.println(Math.ceil(2.33)); // 올림
        System.out.println(Math.round(-2.5)); // 반올림
        System.out.println(Math.random()); // 랜덤
        System.out.println((int) (Math.random() * 6) + 1); // 1에서 6까지 나오는거임
        System.out.println("----------------");

        int n;
        int[] lotto = new int[6];
        /*for (int k = 0; k < 30; k++) {

            System.out.println();
        }*/
        //out: 이라는 레이블? 쓰고 countinue out? 이렇게쓰면 안쪽 for 버리고 바깥 out 이동 ? 인가 뭐 이런거
        for (int i = 0; i < 6; i++) {
            while (true) {
                n = (int) (Math.random() * 7 + 1); // 그냥하면 중복뜨는데

                int j;
                for (j = 0; j < i; j++) {
                    if (n == lotto[j]) {
                        break;
                    }
                }

                if (j == i) {
                    lotto[i] = n;
                    System.out.print(lotto[i] + " ");
                    break;
                }

            }

        }


    }
}
