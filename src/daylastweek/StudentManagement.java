package daylastweek;

import day17.ArrayStudent;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 학생 성적 관리 시스템
 * 1.입력
 * 2.수정
 * 3.검색
 * 4.전체출력
 * 0.종료
 *
 * 말도안되는거 입력 -> 빠꾸치고 다시
 *
 * ex) 1번선택 ->  1번입력메뉴 선택 -> 다시 위에꺼 뜨기
 * 0번 -> ㅈㅈ치고 컷
 *
 *
 * */
public class StudentManagement {
    static ArrayList list = new ArrayList<>();
    static StudentService service = new StudentService();

    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        while (true) {

            try {
                Scanner input = new Scanner(System.in);
                System.out.println("학생 정보 관리 시스템");
                System.out.println("1.입력 ");
                System.out.println("2.수정 ");
                System.out.println("3.검색 ");
                System.out.println("4.전체 출력 ");
                System.out.println("0. ㅈㅈ치기");
                System.out.print("옵션 선택 : ");
                int number = input.nextInt();
                input.nextLine();
                switch (number) {
                    case 0:
                        service.save();
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    case 1:
                        studentdlqfur(input);
                        break;
                    case 2:
                        repair(input);
                        break;
                    case 3:
                        studentiswho(input);
                        break;
                    case 4:
                        print();
                        break;

                    default:
                        System.out.println("빠꾸");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("빠꾸");
            }

        }
    }

    public static void studentdlqfur(Scanner input) {

        for (int i = 0; i < 3; i++) {

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
                list.add(who);
                service.add(who);

            } catch (Exception e) {
                System.out.println("다시");
                i--;
            }

        }

    }

    public static void repair(Scanner input) {
        System.out.print("정보 수정할 학생 학번 입력 : ");
        int num = input.nextInt();
        for (int i = 0; i < service.getList().size(); i++) {
            ArrayStudent who = service.getList().get(i);
            if (who.getNum() == num) {
                try {
                    input.nextLine();
                    System.out.print("이름 입력 : ");
                    String repairName = input.nextLine();
                    System.out.print("국어 성적 입력 : ");
                    int repairKor = input.nextInt();
                    System.out.print("수학 성적 입력 : ");
                    int repairMath = input.nextInt();
                    System.out.print("영어 성적 입력 : ");
                    int repairEng = input.nextInt();
                    input.nextLine();

                    who.setName(repairName);
                    who.setKor(repairKor);
                    who.setMath(repairMath);
                    who.setEng(repairEng);

                    System.out.println("수정완료 : " + who);
                    return;

                } catch (Exception e) {
                    System.out.println("다시");
                    i--;
                }

            }

        }
        System.out.println("학생이 없습니다");
        System.out.println();

    }

    public static void studentiswho(Scanner input) {

        System.out.print("조회할 학생의 학번을 입력하시오 : ");
        int num = input.nextInt();

        for (int i = 0; i < service.getList().size(); i++) {
            ArrayStudent who = service.getList().get(i);
            if (who.getNum() == num) {
                System.out.println(who);
                System.out.println();
                return;
            }
        }

        System.out.println("학생이 없습니다");
        System.out.println();
    }

    public static void print() {
        System.out.println(list);
        System.out.println("(학번 ? : 이름,  국어, 수학, 영어,  평균)");
        System.out.println("--------------------------------");
        for (int i = 0; i < service.getList().size(); i++) {
            System.out.println(service.getList().get(i));
        }
    }


}
