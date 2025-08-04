package day9;

public class Student {
    String studentname;
    int grade;
    String address;
    //필드 : 객체의 상태
    private int studentID;  //ex) 프라이빗하면 딱 요 해당 클래스에서만 허용하게해서 다른곳에서 오류뜸

    //생성자
    Student() {
    }

    ;  //(생성자)이거를 써야함

    Student(int studentID, String studentname, int grade, String address) {
        this.studentID = studentID;
        this.studentname = studentname;
        this.grade = grade;
        this.address = address;

    }

    //메서드 : 객체가 할 수 있는것, 동작
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    void greet() {
        System.out.println(studentname + "안녕하세요");
    }

}
