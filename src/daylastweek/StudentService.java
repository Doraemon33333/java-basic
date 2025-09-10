package daylastweek;


import day17.ArrayStudent;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StudentService {
    private final String filename = "C:\\java-busan-12th\\java-basic\\studentwho.txt";
    private ArrayList<ArrayStudent> studentlist;
    private int number;
    private ObjectInputStream inputStream;          //입력 스트림
    private ObjectOutputStream outputStream;

    public StudentService() {
        try {
            inputStream = new ObjectInputStream(new FileInputStream(filename));
            number = (Integer) inputStream.readObject();
            studentlist = (ArrayList<ArrayStudent>) inputStream.readObject();
        } catch (Exception e) {
            studentlist = new ArrayList<>();
        }
    }

    //학생정보 저장, 새로운 번호 부여
    public void add(ArrayStudent s) {
        number++;
        s.setNum(number);
        studentlist.add(s);
    }

    //전체 출력
    public ArrayList<ArrayStudent> getList() {
        return studentlist;
    }
    //삭제


    public void save() {
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filename));
            Integer numberObject = number;
            outputStream.writeObject(numberObject);
            outputStream.writeObject(studentlist);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
