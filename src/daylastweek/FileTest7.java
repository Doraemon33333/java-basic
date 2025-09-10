package daylastweek;

import day17.ArrayStudent;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileTest7 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.dat"));

        // out.writeObject(new Integer());
        //out.writeObject(new StringBuffer("asasasasa"));
        //out.writeObject(new ArrayList<String>());

        //스튜던트에서 Serializable 이거 필요함
        out.writeObject(new ArrayStudent("佐藤", 100, 100, 100));
        out.writeObject(new ArrayStudent("青木", 100, 100, 100));
        out.writeObject(new ArrayStudent("坂本", 100, 100, 100));

        out.close();
    }
}
