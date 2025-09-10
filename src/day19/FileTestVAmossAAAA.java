package day19;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileTestVAmossAAAA {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        BufferedWriter out = null;
        String filename = null;
        String content = null;
        String YesorNO = "";
        File a = null;
        //파일명 입력받기
        //파일명으로 File객체 생성
        //이미 있는 이름인지 확인
        //있으면 덮어쓸지 여부 확인
        // N입력시 새로 파일명 입력

        while (true) {
            System.out.print("파일명을 입력하세요 : "); //C:\java-busan-12th\java-basic\\aaaaa.txt

            a = new File("C:\\java-busan-12th\\java-basic\\" + input.nextLine() + ".txt");
            if (a.isFile()) {

                System.out.println("파일이 이미 있다");
                System.out.print("파일 명을 덮어쓰겠습니까?(Y / N)): ");
                YesorNO = input.nextLine();

            } else {
                a.createNewFile();
                break;
            }


            if (YesorNO.equals("Y") || YesorNO.equals("y")) {
                a.createNewFile();
            } else {
                continue;
            }
            break;
        }

        //입력받은 이름으로 파일 생성(=스트림 객체 생성)
        //반복적으로 내용 입력받아 파일에 저장
        //새로운 행에서 앤터치면 종료
        // 스트림 닫기
        System.out.println("あなたは　ファイルを作った！");
        out = new BufferedWriter(new FileWriter(a));
        System.out.println("内容を入力してください");
        while (true) {
            String w;
            w = input.nextLine();

            out.write(w);
            //out.flush() 이건 밀어내기?
            out.write('\n');
            //w.isEmpty()
            if (w.equals("")) {
                break;
            }
        }
        out.close();
    }


}
