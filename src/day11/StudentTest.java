package day11;
//static은 객체를 안만들어도 클래스 이름만으로 직접 접근 가능하게 하기 위해 쓰는건가..
//일단 메인은 먼저 실행을 해야하니

public class StudentTest {
    public static void main(String[] args) {
        System.out.println(Student.getSerialNum());
        Student sato = new Student("真奈", 80);
        Student sato2 = new Student("真奈2", 85);

        System.out.println(sato);
        System.out.println(sato2.getGrade());
        // System.out.println(sato2.serialNum); //?
        //System.out.println(Student.serialNum);


    }
}
