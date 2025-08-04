package day6;

public class LoopPractice {
    public static void main(String[] args) {
        //출력문을 뽑기 1 2 3 4 5 6 7 8 9 10
        // 0 2 4 6 8 10
        // 1 3 5 7 9
        // 10 9 8 7 6 5 4 3 2 1
        // 10 20 30 40 50
        // 2 4 8 16 32
        // 1 10 100 1000 10000
        //

        int i = 1;

        for (   ; i <= 10 ; i++) {

            System.out.printf("%d ", i);

        }
        System.out.printf("%n");
        System.out.println("--------------------------");

        int j = 0;

        for (   ; j <= 10 ; j++) {

            if(j % 2 != 0){
                continue;
            }
            System.out.printf("%d ", j);

        }
        System.out.printf("%n");
        System.out.println("--------------------------");

        int k = 0;

        for (   ; k <= 10 ; k++) {

            if(k % 2 == 0){
                continue;
            }
            System.out.printf("%d ", k);

        }
        System.out.printf("%n");
        System.out.println("--------------------------");

        int l = 10;

        for (   ; l > 0 ; l--) {


            System.out.printf("%d ", l);

        }
        System.out.printf("%n");
        System.out.println("--------------------------");

        int m = 10;

        for (   ; m <= 50 ; m++) {

            if(m % 10 != 0){
                continue;
            }
            System.out.printf("%d ", m);

        }
        System.out.printf("%n");
        System.out.println("--------------------------");

        int n = 1;
        int involution = 1;

        for (   ; n <= 5 ; n++) {
            involution *= 2;

            System.out.printf("%d ", involution);

        }
        System.out.printf("%n");
        System.out.println("--------------------------");

        int o = 0;
        int involution2 = 1;

        for (   ; o <= 4 ; o++) {

            if (o != 0) {
                involution2 *= 10;
            }

            System.out.printf("%d ", involution2);

        }
        System.out.printf("%n");
        System.out.println("--------------------------");



    }
}
