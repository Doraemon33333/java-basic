package day6;

public class StarSmile {
    public static void main(String[] args) {

        int a = 5;
        int b =10;

        int i = 1;

        for (   ; i <= a*b ; i++) {

            if(i == 2 || i == 3 || i == 4 ||i == 7 ||i == 8 ||i == 9){
                System.out.print("*");
            }
            else if (i == 11 || i == 15 || i == 16 || i == 20) {
                System.out.print("*");
            }
            else if(i == 21||i == 30){
                System.out.print("*");
            }
            else if (i == 33  ||i == 38 ) {
                System.out.print("*");
            }
            else if (i == 45 ||i == 46  ) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }

            if(i % b == 0) {
                System.out.println();

            }
        }

        System.out.println("-----------------------------");

        int c = 9;
        int d =9;

        int j = 1;

        for (   ; j <= c*d ; j++) {

            if(j == 5 ||j == 13 ||j == 15 ||j == 21 ||j == 25 ||j == 29 ||j == 35 ||j == 37 ||j == 45 ||j == 47 ||
                    j == 53||j == 57||j == 61||j == 67||j == 69||j == 77){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }

            if(j % d == 0) {
                System.out.println();

            }
        }

        System.out.println("-----------------------------");

        int e = 7;
        int f = 13;

        int k = 1;

        for (   ; k <= e*f ; k++) {

            if(k == 7 ||k == 19 ||k == 20 ||k == 21 ||k == 27 ||k == 28 ||k == 29 ||k == 30 ||k == 31 ||k == 32 ||k == 33 ||k == 34 ||k == 35 ||k == 36 ||k == 37 ||k == 38||k == 39 ||k == 42 ||k == 43 ||k == 44 ||k == 45 ||k == 46 ||k == 47 ||k == 48 ||k == 49 ||k == 50 ||k == 56 ||k == 57 ||k == 58 ||k == 59 ||k == 60 ||k == 61 ||k == 62 ||k == 68 ||k == 69 ||k == 70 ||k == 74 ||k == 75 ||k == 76 ||k == 80 ||k == 81 ||k == 89|| k == 90 ){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }


            if(k % f == 0) {
                System.out.println();
            }

        }

    }
}