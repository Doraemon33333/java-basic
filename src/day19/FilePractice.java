package day19;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
실행 1
파일명 입력 : "C:\\java-busan-12th\\a.txt"

import java. .....
...
실행 2
파일명입력 : C:\\?????\\?????
파일이 없습니다

*/
public class FilePractice {
    public static void main(String[] args) {
        FileReader in = null;
        int ch;
        System.out.print("파일명을 입력하세요 : ");
        try {
            Scanner input = new Scanner(System.in);
            //String file = input.nextLine();
            in = new FileReader(input.nextLine());

            //out = new FileWriter("C:\\java-busan-12th\\a.txt");
            //out = new FileWriter("C:\\dsgagdsgdjaskgnadkjgadsngkadw\\a2.txt");
            System.out.println("아마 있을걸");
        } catch (IOException e) {
            System.out.println("파일이 없습니다");
            return;
        }
        try {
            while ((ch = in.read()) != -1) {

                System.out.print((char) ch);

            }
        } catch (Exception e) {
            System.out.println("다시");
            e.printStackTrace();
        }
    }
}
