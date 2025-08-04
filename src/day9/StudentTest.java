package day9;

// 다른 패키지에 있는 클래스를 가져다 쓸수 있음 (import 키워드 필요)

import day8.kitchen.Ramen;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Student sato = new Student(); //이 뒤로 정보를  넣어줘야함
        Scanner sc = new Scanner(System.in);
        //sato.setStudentID(123214);
        sato.studentname = "MANA";

        System.out.println(sato.getStudentID());   //아까 프라이빗 했을때 안되었음 다른 파일에 적었던 get 이용
        System.out.println(sato.studentname);


        Student kim = new Student(141122, "김さん", 1, "부산 중구");
        System.out.println(kim.studentname + "의 학번은 " + kim.getStudentID() + "입니다");
        System.out.println(kim.studentname);
        System.out.println(kim);  // 리모컨 -> 참조값, 주소값

        kim.setStudentID(12345);
        System.out.println(kim.studentname + "의 학번은 " + kim.getStudentID() + "입니다"); //그냥 하면 학번(숫자)이 바뀌어버림

        kim.greet();

        Ramen ram = new Ramen();
        // 같은 이름의 두 클래스를 하나의 패키지 안에 구현하면 오류
        // 패키지 이름을 포함한 클래스 이름 = 클래스 전체 이름
        day8.Student stu = new day8.Student();
        stu.name = "佐藤さん";   //다른데서 가져오기 안됨 이때 접근 제어자 라는거 있음
    }
}
