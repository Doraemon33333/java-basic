package day13and14;

import java.util.Scanner;

public class Newteacheriftest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("number gogo : ");
        int a = input.nextInt();
        if (a > 0) {
            System.out.println("양수");
        } else if (a == 0) {
            System.out.println("0");
        } else {
            System.out.println("음수");
        }

        switch (a) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println("?");
                break;
            default:
                System.out.println("ㅋ");
        }

    }
}
