package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phone_num;
        char number;


        System.out.print("휴대폰 번호 입력(000-0000-0000 형식) : ");
        phone_num = input.nextLine();


        if (phone_num.length() != 13) {
            System.out.println("13자로 입력하세요.");
            return;
        }

        if (phone_num.charAt(3) != '-' || phone_num.charAt(8) != '-') {
            System.out.println("형식이 잘못되었습니다 ");
            return;
        }


        for (int i = 0; i < phone_num.length(); i++) {
            number = phone_num.charAt(i);
            if ((i != 3 && i != 8) && (number < '0' || number > '9')) {
                System.out.println("전화번호는 숫자로 입력하세요.");
                return;
            }
        }

        System.out.println("입력한 전화번호는 " + phone_num + "입니다");
    }
}
