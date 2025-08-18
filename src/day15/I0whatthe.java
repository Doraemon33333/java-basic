package day15;

import java.io.IOException;

public class I0whatthe {
    public static void main(String[] args) {
        try {
            sub();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void sub() throws IOException {
        int i = System.in.read();
        System.out.println((char) i);
    }
}
