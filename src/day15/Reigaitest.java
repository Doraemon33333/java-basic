package day15;

import java.io.IOException;

public class Reigaitest {
    public static void main(String[] args) {

        try {
            int i = System.in.read();
            System.out.println((char) i);
        } catch (IOException e) {
            System.out.println("다시 해");
            e.printStackTrace();
        }// 트라이 안에 쳐박는게 첫번째 방법

        // -> 저 위에 메인 저거 옆에 저래 써도 됨 이게 두번째 방법
        // throws IOException 이거


    }
}
