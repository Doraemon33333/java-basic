package daylastweek;

import day17.ArrayStudent;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileTest8 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.dat"));
        ArrayStudent s = null;


        try {
            while (true) {
                s = (ArrayStudent) in.readObject();
                System.out.println(s);


            }
        } catch (EOFException e) {

        }
        in.close();
    }
}
