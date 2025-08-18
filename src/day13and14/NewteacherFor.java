package day13and14;

import java.util.Scanner;

public class NewteacherFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("number gogo : ");
        a = input.nextInt();
        /*for (int i = 0; i < a; i++) {
            System.out.print(i + 1);
            System.out.print(" ");

        }
        System.out.println();

        for (int i = 0; i <= a; i += 2) {
            System.out.print(i);
            System.out.print(" ");

        }
        System.out.println();

        for (int i = 1; i <= a; i += 2) {
            System.out.print(i);
            System.out.print(" ");
        }

        for (int i = 1; i <= a; i++) {
            System.out.print(i);
            System.out.print(" ");

            if (i % 10 == 0) {
                System.out.println();
            }
            if (i < 10) {
                System.out.print(" ");
            }
        }*/
        int sum = 0;
        for (int i = 0; i <= a; i += 2) {
            sum += i;
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(sum);

        System.out.println();


    }
}
