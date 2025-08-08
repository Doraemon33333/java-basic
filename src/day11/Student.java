package day11;

public class Student {
    private static int serialNum = 1000; //스태틱변수 (정적변수?)
    int studentID;
    String name;
    int grade;

    //studentID 삭제

    public Student(String name, int grade) {
        serialNum++;
        this.studentID = serialNum;
        this.name = name;
        this.grade = grade;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // 생성 -> toString()
    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }


}
