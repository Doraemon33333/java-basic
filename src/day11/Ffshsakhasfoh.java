package day11;

import java.util.Scanner;

// 성적 출력결과 Student[] = new Student[3]
// 학생 객체안에 성적 결과를 출력하는 메서드를 만들것 (한명당 세과목 성적)
// 학생 객체의 생성은 현재 클래스 안에서 입력받아 만들것
// 배열이 완성되면 각 학생의 성적 결과를 출력하고 끝내기

public class Ffshsakhasfoh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        gskgeioggki[] students = new gskgeioggki[3];

        /*for (int i = 0; i < students.length; i++) {
            System.out.printf("학생 %d 이름: ", i + 1);
            String name = input.nextLine();*/

        for (int i = 0; i < 3; i++) {

            String[] name = {"사토", "사카모토", "아오키"};

            int[] score = new int[3]; //매 학생마다 새로운 배열?
            students[i] = new gskgeioggki(name[i], score);
            System.out.println("학번: " + students[i].getStudentID());
            System.out.printf("이름: %s %n", name[i]);

            for (int j = 0; j < 3; j++) {
                System.out.printf("과목 %d 점수 입력: ", j + 1);
                score[j] = input.nextInt();
            }

            System.out.println("----------------");
        }

        students[0].printResult();
        students[1].printResult();
        students[2].printResult();
        //System.out.println(students[0].getName());


        //메서드 getName()은 gskgeioggki 클래스 안에 있는 메서드, 즉, 이미 만들어진 객체에서만 사용할 수 있다
        //이미 생성된 students[0] 객체
    }

}

