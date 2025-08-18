package day13and14.real14;

import javax.swing.*;

public class RealTest {
    public static void main(String[] args) {
        FakeTest t = new FakeTest();
        t.num = 1557;
        t.name = "사토";
        t.output();
        t.setTitle("제목");
        t.setBounds(100, 100, 300, 300);
        t.setVisible(true); // 트루 : 화면에 보임

        JFrame a = new FakeTest();
        Object b = new String(); //String은 오브젝트임, 왼쪽이 상속관계의 상위타입
    }
}
