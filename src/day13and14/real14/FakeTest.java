package day13and14.real14;

import javax.swing.*;

public class FakeTest extends JFrame {
    static int num2;
    //변수 : 객체의 개수와 관계없이 1개만 존재
    //매서드 : 객체와 관계없이 클래스명으로 호출가능
    public final int num3 = 1;
    int num;
    String name;

    public void output() {
        System.out.println("num: " + this.num + ", name : " + this.name);
    }

    public void output2() {
        System.out.println("name is : " + name);
    }


}
// 매서드 앞 스태틱 -> 객체없이 실행가능
// 파이널을 붙힐수있는곳 : 변수앞, 매서드, 클래스 앞에 가능
// 변수 : 값 변경 금지
// 매서드 : 오버라이딩 금지
// 클래스 : 상속금지