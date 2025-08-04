package day8;

public class StudentTest {
    public static void main(String[] args) {

        Student kim = new Student();
        kim.name = "김OO";
        kim.math = 90;
        kim.eng = 87;
        kim.kor = 87;
        kim.pn = "010-1234-5678";
        System.out.println(kim.name);

        kim.goschool();  //스태틱은 객체를 생성하지않아도 부름, 여기선 객체를 만들고 부른거임
    }
}
