package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<Integer> random_number = new ArrayList<>();
        while (random_number.size() < 30) {
            int n = (int) (Math.random() * 100 + 1); //1에서100

            boolean check = false;
            for (int i = 0; i < random_number.size(); i++) {
                if (n == random_number.get(i)) {
                    check = true;
                    break;
                }
            }

            if (check == false) {
                random_number.add(n);
            }

        }
        System.out.println("리스트의 내용 : " + random_number);
        System.out.println();
        System.out.print("정수 하나를 입력하세요 : ");
        int a = input.nextInt();


        System.out.print(a + "의 배수는 ");
        int count = 0;
        for (int i = 0; i < random_number.size(); i++) {
            if (random_number.get(i) % a == 0) {
                System.out.print(" " + random_number.get(i));
                count++;
            }
        }
        System.out.print(" 총 " + count + "개 입니다");
    }
}
