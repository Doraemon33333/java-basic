package day19;

//문자 단위 파일 출력

import java.io.FileReader;
import java.io.IOException;

//간단하게 throw Exception
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("C:\\java-busan-12th\\a.txt");
        } catch (Exception e) {
            System.out.println("다시");
        }
        int ch;
        try {
            /*ch = in.read();
            System.out.print(ch);
            ch = in.read();
            System.out.print(ch);
            ch = in.read();
            System.out.print(ch);
            ch = in.read();
            System.out.print(ch);
            ch = in.read();
            System.out.print(ch);*/
            while ((ch = in.read()) != -1) {

                System.out.print((char) ch);

            }

            for (int i = 0; true; i++) {
                ch = in.read();

                if (ch == -1) {
                    break;
                }
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            System.out.println("다시");
        }


        try {
            in.close();
        } catch (IOException e) {
            System.out.println("d");
        }


    }

}
