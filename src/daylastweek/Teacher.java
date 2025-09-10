package daylastweek;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String content;
        File file = null;
        String filename = "";
        BufferedWriter out = null;


        while (true) {
            content = input.nextLine();
            if (content.isEmpty()) {
                break;
            }
            list.add(content);

        }

        //저장 여부 확인
        //저장 또는 프로그램 컷


        for (int i = 0; i < list.size(); i++) {
            out.write(list.get(i));
            out.newLine();

        }
        out.close();

       /* out = new BufferedWriter(new FileWriter("__temp.tmp"));
        while (true) {
            content = input.nextLine();
            if (content.isEmpty()) break;
            out.write(content);
            out.newLine();

        }
        out.close();

        //저장 여부 확인
        // 저장 프로그램 종료
        file = new File("__temp.tmp");
        if(){
           //저장함

            File newFile = new File(filename);
            file.renameTo(newFile);
        }
        else{
            file.delete();
        }*/
    }
}
