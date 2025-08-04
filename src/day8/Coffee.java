package day8;

import java.util.Scanner;

public class Coffee {
    Scanner input = new Scanner(System.in);
    int Nedan = 0;
    int Nedan2 = 0;

    public void mainMenu() {
        System.out.println("--★ 커피 키오스크 ★--");
        System.out.println("1. 아메리카노");
        System.out.println("2. 카페라떼");
        System.out.println("3. 바닐라라떼");
        System.out.println("0. 종료");


        while (true) {
            System.out.print("메뉴를 선택하세요: ");

            int choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("아메리카노 선택");
                    System.out.print("아이스 or 핫 선택하시오, 1.아이스 2.핫 : ");
                    int ICEorHOT = input.nextInt();
                    switch (ICEorHOT) {
                        case 1:
                            System.out.println("(아이스) 아메리카노 선택");
                            Nedan += 2000;
                            break;
                        case 2:
                            System.out.println("(핫) 아메리카노 선택");
                            Nedan += 1500;
                            break;
                    }
                    break;
                case 2:
                    System.out.println("카페라떼 선택");
                    System.out.print("아이스 or 핫 선택하시오, 1.아이스 2.핫 : ");
                    ICEorHOT = input.nextInt();
                    switch (ICEorHOT) {
                        case 1:
                            System.out.println("(아이스) 카페라떼 선택");
                            Nedan += 3000;
                            break;
                        case 2:
                            System.out.println("(핫) 카페라떼 선택");
                            Nedan += 2500;
                            break;
                    }
                    break;

                case 3:
                    System.out.println("바닐라라떼 선택");
                    System.out.print("아이스 or 핫 선택하시오, 1.아이스 2.핫 : ");
                    ICEorHOT = input.nextInt();
                    switch (ICEorHOT) {
                        case 1:
                            System.out.println("(아이스) 바닐라라떼 선택");
                            Nedan += 3000;
                            break;
                        case 2:
                            System.out.println("(핫) 바닐라라떼 선택");
                            Nedan += 2500;
                            break;
                    }
                    break;

                case 0:

                    System.out.println("지금까지의 결제금액 : " + Nedan);
                    System.out.println("다음으로 넘어갑니다");
                    return;
            }
            System.out.println();

        }

    }

    public void dessertMenu() {
        System.out.println("--디저트를 고르세요");
        System.out.println("1. 마카롱");
        System.out.println("2. 티라미수 케이크");
        System.out.println("0. 종료");

        while (true) {
            System.out.print("디저트를 선택하세요: ");

            int choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("마카롱 선택");
                    System.out.println("1.블루베리");
                    System.out.println("2.딸기");
                    System.out.print("3.초코 : ");
                    int dessertAzi = input.nextInt();
                    switch (dessertAzi) {
                        case 1:
                            System.out.println("블루베리 마카롱 선택");
                            Nedan2 += 2200;
                            break;
                        case 2:
                            System.out.println("딸기 마카롱 선택");
                            Nedan2 += 2300;
                            break;
                        case 3:
                            System.out.println("초코 마카롱 선택");
                            Nedan2 += 2500;
                            break;

                    }
                    break;
                case 2:
                    System.out.println("티라미수 케이크 선택");
                    System.out.print("케이크 사이즈를 선택하시오, 1.S, 2.M, 3.L : ");
                    int cakeSize = input.nextInt();
                    switch (cakeSize) {
                        case 1:
                            System.out.println("S size 선택");
                            Nedan2 += 5000;
                            break;
                        case 2:
                            System.out.println("M size 선택");
                            Nedan2 += 6000;
                            break;
                        case 3:
                            System.out.println("L size 선택");
                            Nedan2 += 7000;
                            break;
                    }
                    break;

                case 0:
                    System.out.println("주문을 종료합니다");
                    return;

            }
            System.out.println();


        }

    }

    public void Nedantotal() {
        System.out.println(" 총 결제금액: " + (Nedan + Nedan2) + "원 입니다");
    }


}
