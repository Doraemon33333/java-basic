package daylastweek;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileVerson3 {
    public static void main(String[] args) throws IOException {


        //내용을 먼저 입력해라
        //1.abc
        //2.가나다
        //3.123
        // 위에꺼 모아놨다가
        // 파일 만들고
        // 내용 저장

        //String 이어붙히기
        //StringBuffer에 모아두기 -> toString() 로 String 변환
        //String들을 ArrayList에 저장 -> 반복문으로 String들을 꺼내기 ㅋ
        //임시 파일을 만들어서 저장하기 -> 저장 여부에 따라 삭제하거나 이름 바꿔치기 하기


        Scanner input = new Scanner(System.in);
        BufferedWriter out = null;
        String filename = null;
        String content;
        String YesorNO = "";
        ArrayList<String> list = new ArrayList<>();

        System.out.println("内容を入力してください");


        while (true) {
            content = input.nextLine();
            if (content.isEmpty()) {
                break;
            }
            list.add(content);

        }

        System.out.print("저장 하시겠습니까?(Y / N): ");
        YesorNO = input.nextLine();
        while (true) {


            if (YesorNO.equals("Y") || YesorNO.equals("y")) {


                System.out.print("파일명을 입력하세요 : "); //C:\java-busan-12th\java-basic\\aaaaa.txt
                File a = new File("C:\\java-busan-12th\\java-basic\\" + input.nextLine() + ".txt");

                if (a.isFile()) {

                    System.out.println("파일이 이미 있다");
                    System.out.print("파일 명을 덮어쓰겠습니까?(Y / N)): ");
                    String YesorNO2 = input.nextLine();
                    if (YesorNO2.equals("Y") || YesorNO2.equals("y")) {
                        out = new BufferedWriter(new FileWriter(a));
                        for (int i = 0; i < list.size(); i++) {
                            out.write(list.get(i));
                            out.newLine();

                        }
                        out.close();
                        System.out.println("저장 완료");
                        break;
                    } else {
                        continue;
                    }

                }
                out = new BufferedWriter(new FileWriter(a));
                for (int i = 0; i < list.size(); i++) {
                    out.write(list.get(i));
                    out.newLine();

                }
                out.close();
                System.out.println("저장 완료");
                break;

            } else {
                break;
            }


        }


    }


}











