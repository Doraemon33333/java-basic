package day17;

import java.util.Scanner;

public class MathBaseball {
    public static void main(String[] args) {
        int num;
        int[] com_num = new int[4];
        for (int i = 0; i < 4; i++) {
            while (true) {
                num = ((int) (Math.random() * 10));

                if (i == 0 && num == 0) {
                    continue;
                }

                int j;
                for (j = 0; j < i; j++) {
                    if (num == com_num[j]) {
                        break;
                    }
                }

                if (j == i) {

                    com_num[i] = num;
                    //System.out.print(com_num[i]);
                    break;
                }

            }


        }
        System.out.println();
        System.out.println("게임 규칙 1. 네자리수를 입력하세요(자리수 각각 모두 다른 숫자입니다)");
        System.out.println("게임 규칙 2. 첫자리 0은 아님");
        System.out.println("게임 규칙 3. 너가 입력한 숫자랑 컴퓨터 숫자가 일치하면서 자릿수까지 맞추면 S");
        System.out.println("게임 규칙 4. 그냥 숫자만 겹치는게 있다면 B");
        System.out.println("게임 규칙 5. 이제 알아서 추리해서 맞추셈");

        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.print("숫자를 입력하세요 : ");
            int you_num = input.nextInt();
            int s_count = 0;
            int b_count = 0;
            int a = you_num / 1000;
            int b = (you_num % 1000) / 100;
            int c = (you_num % 100) / 10;
            int d = you_num % 10;

            if (you_num > 9999) {
                System.out.println("다시");
                continue;
            }


            if (a == com_num[0]) {
                s_count++;
            }
            if (a == com_num[1] || a == com_num[2] || a == com_num[3]) {
                b_count++;
            }

            if (b == com_num[1]) {
                s_count++;

            }
            if (b == com_num[0] || b == com_num[2] || b == com_num[3]) {
                b_count++;
            }

            if (c == com_num[2]) {
                s_count++;

            }
            if (c == com_num[0] || c == com_num[1] || c == com_num[3]) {
                b_count++;
            }

            if (d == com_num[3]) {
                s_count++;

            }
            if (d == com_num[0] || d == com_num[1] || d == com_num[2]) {
                b_count++;
            }


            if (s_count == 0 && b_count == 0) {
                System.out.println("OUT");
            } else if (s_count == 4) {
                System.out.println("正解！！！");
                return;
            } else {
                System.out.println(s_count + "S " + b_count + "B");
            }

        }
    }
}
