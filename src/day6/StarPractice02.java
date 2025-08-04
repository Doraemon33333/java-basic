package day6;

//import java.util.Scanner;

public class StarPractice02 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //int a = input.nextInt();

        for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        for (int i = 1; i <= 5; i++) {

            for (int j = 2; j <= i; j++) {
                System.out.print(" ");

            }

            for (int j = 9; j >= 2 * i - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        for (int i = 1; i <= 9; i++) {

            if (i <= 5) {
                for (int j = 4; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 2; j <= i - 4; j++) {
                    System.out.print(" ");
                }
                for (int j = 9; j >= 2 * (i - 4) - 1; j--) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        System.out.println("-----------------");

        for (int i = 1; i <= 9; i++) {

            if (i <= 5) {

                for (int j = 2; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 9; j >= 2 * i - 1; j--) {
                    System.out.print("*");
                }
            }
            if (i > 5) {

                for (int j = 4; j >= i - 4; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * (i - 4) - 1; j++) {
                    System.out.print("*");
                }

            }

            System.out.println();
        }


    }
}
