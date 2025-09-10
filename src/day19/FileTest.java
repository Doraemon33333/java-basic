package day19;

//문자 단위 파일 출력

import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        FileWriter out = null;

        try {
            out = new FileWriter("C:\\java-busan-12th\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("나가");
            return;
        }
        try {
            out.write("ㅇㅇ");
            out.write('\n');
            out.write("あいうえお");
            out.write('\n');
            out.write("かきくけこ");
            out.write('\n');
            out.write("さしすせそ");
            out.write('\n');
            out.write("たちつてと");
            out.write('\n');
            out.write("なにぬねの");
            out.write('\n');
            out.write("はひふへほ");
            out.write('\n');
            out.write("まみむめも");
            out.write('\n');
            out.write("や ゆ よ");
            out.write('\n');
            out.write("らりるれろ");
            out.write('\n');
            out.write("わ を   ん");

        } catch (IOException e) {
            System.out.println("돌아가");
        }
       /* あいうえお

        かきくけこ

        さしすせそ

        たちつてと

        なにぬねの

        はひふへほ
        まみむめも

        やゆよ
        らりるれろ

        わ を
        ん*/


        try {

            out.close();
        } catch (IOException e) {
            System.out.println("돌아가");
        }
    }

}
