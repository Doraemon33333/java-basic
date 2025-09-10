package day19;

import java.io.File;
import java.io.IOException;

public class FileTest4 {
    public static void main(String[] args) {
        File a = new File("a.txt"); //없는파일
        File b = new File("C:\\fafafafafafa"); // 있는디랙토리
        File c = new File("."); // 현재 디렉토리
        File d = new File("sub"); // 없는 디랙토리
        File e = new File("C:\\fafafafafafa\\aaa.txt"); // 있는파일


        try {
            System.out.println(a.exists()); //있냐없냐
            System.out.println(a.isFile()); // 파일로써 있는지
            System.out.println(a.isDirectory());// 디랙토리로 있는지
            System.out.println(b.exists());
            System.out.println(b.isFile());
            System.out.println(b.isDirectory());
            System.out.println(c.getAbsolutePath());
            System.out.println(c.getCanonicalPath());
            System.out.println(e.getName()); // 이름
            System.out.println(e.length()); // 크기


            //현재 경로에 a.txt 파일이 없으면 생성하기
            if (!a.isFile()) {
                a.createNewFile();
            }
            // sub 폴더 없으면 생성
            if (!d.isDirectory()) {
                d.mkdir();
            }

            //a 객체가 가리키는 파일 삭제
            //a.delete();
            //d.delete();


        } catch (IOException ee) {
            ee.printStackTrace();

        }
        System.out.println();


    }
}
