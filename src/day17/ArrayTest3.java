package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        // 이름 : ?? 국어 100점 수학 90점 영어 41점
        ArrayStudent sato = new ArrayStudent("佐藤", 95, 84, 41);
        ArrayStudent aoki = new ArrayStudent();

        int k = sato.getKor();
        sato.setEng(77);
        int t = sato.getTotal();

        System.out.println(sato);
        System.out.println(sato.equals(aoki)); // 사토랑 아오키의 정보가 같냐? 물어보는거


        String a = "abc";
        String b = "add";
        System.out.println(a.compareTo(b));
        //a, b 의 차이 (글자수 다르면 글자수의 차이가 출력됨 ex) abc, abcde 있으면 -2?

        //학생 3명을 입력받아 리스트에 저장하고 전부 출력

        ArrayList<ArrayStudent> slist = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Scanner input = new Scanner(System.in);
            try {
                System.out.print("이름 입력 : ");
                String name = input.nextLine();
                System.out.print("국어 성적 입력 : ");
                int kor = input.nextInt();
                System.out.print("수학 성적 입력 : ");
                int math = input.nextInt();
                System.out.print("영어 성적 입력 : ");
                int eng = input.nextInt();
                input.nextLine();
                ArrayStudent who = new ArrayStudent(name, kor, math, eng);
                slist.add(who);
            } catch (Exception e) {
                System.out.println("다시");
                i--;
            }

        }
        System.out.println(slist);

        //정렬 -> Collections.sort(slist);
        // 기억해두기 : Serializable, CharSequence, Comparable<String>,
        Collections.sort(slist);
        System.out.println(slist);

    }

}
