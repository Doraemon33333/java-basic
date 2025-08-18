package day13and14;

import java.util.Scanner;

public class Whilepuhahaha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1000;
        int sum = 0;

       /* while (a != 0) {
            System.out.print("number gogo : ");
            a = input.nextInt();
            sum += a;

        }

        do {
            System.out.print("number : ");
            a = input.nextInt();
            sum += a;
        } while (a != 0);
        */

        while (true) {
            try {      // 오류가 나올법한 부분 트라이 안에 박아넣고
                System.out.print("number : ");
                a = input.nextInt();

            } catch (Exception e) {
                System.out.println("잘못입력함");
                input.nextLine();
                continue;//  컨티뉴 , 브레이크 사용해서 위로갈지 밑으로 갈지
            }

            if (a == 0) {
                break;
            }
            sum += a;
        }
        System.out.println("합계 is : " + sum);
    }
}
