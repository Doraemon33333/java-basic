package day15;

import java.util.Calendar;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id;


        //14글자 이상 -> 잘못입력했습니다
        //제대로 입력 -> xx년생 ??살 남자 이라 출력
        // 월 , 일 생각,


        while (true) {
            System.out.print("주민등록번호 입력하세요 : ");
            id = input.nextLine();
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);


            //System.out.println(Integer.parseInt("20" + id.substring(0, 2))); 이거 2001나옴
            //System.out.println(year); 이거는 2025


            if (id.length() != 14 || id.charAt(6) != '-') {
                System.out.println("빠꾸");
                continue;
            }

            int a = Integer.parseInt(id.substring(2, 4)); // 1월부터 12월까지만 거르는거
            if (a >= 13) {
                System.out.println("빠꾸2");
                continue;
            }


            if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {

                int b = Integer.parseInt(id.substring(4, 6));
                if (b >= 32 || b <= 0) {
                    System.out.println("빠꾸3");
                    continue;
                }
            } else if (a == 2) {
                // 윤년 판별
                int birthyear = Integer.parseInt(id.substring(0, 2));
                boolean leapYear = (birthyear % 4 == 0 && birthyear % 100 != 0 || birthyear % 400 == 0);

                // 윤년이면 29일까지, 아니면 28일까지
                int maxDay = leapYear ? 29 : 28;

                int b = Integer.parseInt(id.substring(4, 6));
                if (b >= maxDay + 1 || b <= 0) {
                    System.out.println("빠꾸3");
                    continue;
                }
            } else if (a == 4 || a == 6 || a == 9 || a == 11) {
                int b = Integer.parseInt(id.substring(4, 6));
                if (b >= 31 || b <= 0) {
                    System.out.println("빠꾸3");
                    continue;
                }
            } else {
                System.out.println("빠꾸5");
                continue;
            }

            if (Integer.parseInt(id.substring(0, 2)) >= 0 && Integer.parseInt(id.substring(0, 2)) <= 25) {
                if (id.charAt(7) != '3' && id.charAt(7) != '4') {
                    System.out.println("빠꾸4");
                    continue;
                }

            }
            if (Integer.parseInt(id.substring(0, 2)) >= 26 && Integer.parseInt(id.substring(0, 2)) <= 99) {
                if (id.charAt(7) != '1' && id.charAt(7) != '2') {
                    System.out.println("빠꾸4");
                    continue;
                }

            }

            int old, seiki;
            if (Integer.parseInt("20" + id.substring(0, 2)) <= year) {
                old = year - Integer.parseInt("20" + id.substring(0, 2)) + 1;
                seiki = 20;
            } else {

                old = year - Integer.parseInt("19" + id.substring(0, 2)) + 1;
                seiki = 19;
            }

            String seibetsu = "";
            if (id.charAt(7) == '1' || id.charAt(7) == '3') {
                seibetsu = "남자";
            } else if (id.charAt(7) == '2' || id.charAt(7) == '4') {
                seibetsu = "여자";
            } else {
                System.out.println("빠꾸5");
            }

            System.out.println(seiki + id.substring(0, 2) + "년생, " + old + " 살, " + seibetsu + "입니다");


        }





        /*문자열을 계산 가능한 int로 변환
        String s = "01";
        int n = Integer.parseInt(s);
        char ch = '0';
        if(ch>='0' && ch<='9'){
        } -> 숫자인지 아닌 지 확인법

        날짜 시간 정보 확인
        Calendar c = Calender.getInstance();
        int year = c.get(Calender.YEAR);

         */


    }
}
