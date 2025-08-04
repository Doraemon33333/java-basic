package day6;

import java.util.Scanner;

public class Star22222 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        //for을 2개 써서 해보기

        for (int i = 1, k = 1; i <= a; i++, k++) {

            for (int j = 1; j <= 2 * a - 1; j++) {

                if (j <= a - k || j >= a + k) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();

        }

        System.out.println("--------------------");


        //for을 1개만 써서 해보기

        for (int i = 1, j = 0, k = 1; i <= a * (2 * a - 1); i++) {

            if (i <= (2 * a - 1) * k) {
                if (i <= j + (a - k) || i >= j + (a + k)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            if (i % (2 * a - 1) == 0) {
                System.out.println();
                k++;
                j += (2 * a - 1);
            }
        }

        System.out.println("--------------------");

        // 다이아몬드 모양

        for (int i = 1; i <= 2 * a - 1; i++) {


            if (i <= a) {
                for (int j = 1; j <= a - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            }
            if (i > a) {
                for (int j = 1; j <= i - a; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * a - 2 * (i - (a - 1)) + 1; j++) {
                    System.out.print("*");
                }
            }


            System.out.println();

        }


    }
}
