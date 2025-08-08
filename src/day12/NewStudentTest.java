package day12;

import java.util.Scanner;

public class NewStudentTest {
    static NewStudent[] students = new NewStudent[3];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("학생 정보 관리");
        System.out.print("1. 학생 정보 입력(1번 누르세요) : ");

        while (true) {

            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    if (students[0] != null) {
                        System.out.println("이미 학생 정보를 입력했습니다");
                        break;
                    }
                    pldsafqqg(input);
                    break;
                case 2:
                    readStudents(input);
                    break;
                case 3:
                    allStudents(input);
                    break;
                case 4:
                    studentrepair(input);
                    break;
            }
            System.out.println("2. 학생 정보 읽기");
            System.out.println("3. 학생 정보 출력");
            System.out.println("4. 학생 정보 수정");
            System.out.println("0. 시스템 종료");
            System.out.print("뭐를 원하는가? ");
        }

        //System.out.println("학생 정보 삭제");
    }

    public static void pldsafqqg(Scanner input) {

        //매 학생마다 새로운 배열?
        for (int i = 0; i < 3; i++) {
            String[] name = {"사토", "사카모토", "아오키"};
            int[] score = new int[3];
            students[i] = new NewStudent(name[i], score);
            System.out.println("학번: " + students[i].getStudentID());
            System.out.printf("이름: %s %n", name[i]);

            for (int j = 0; j < 3; j++) {
                System.out.printf("과목 %d 점수 입력: ", j + 1);
                score[j] = input.nextInt();
            }
            input.nextLine();
            //참조형 주소를 가리킨다
        }

        System.out.println("----------------");
    }

    public static void readStudents(Scanner input) {
        System.out.print("조회할 학생의 학번을 입력하시오 : ");
        int num = input.nextInt();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getStudentID() == num) {
                students[i].printResult();
                System.out.println();
                return;
            }

        }
        System.out.println("학생이 없습니다");
        System.out.println();
    }

    public static void allStudents(Scanner input) {
        students[0].printResult();
        students[1].printResult();
        students[2].printResult();
    }

    public static void studentrepair(Scanner input) {
        System.out.print("성적을 수정할 학생의 학번을 입력하시오 : ");
        int num = input.nextInt();

        if (num == 10001) {
            students[0].printResult();

            System.out.println("성적 수정 합니다");
            for (int j = 0; j < 3; j++) {
                System.out.printf("과목 %d 점수 입력: ", j + 1);
                students[0].getScore()[j] = input.nextInt();
            }
            students[0].printResult();


        } else if (num == 10002) {
            students[1].printResult();
        } else if (num == 10003) {
            students[2].printResult();
        } else {
            System.out.println("학생이 없습니다");
        }
        System.out.println();


    }

}
