package bioniclessons.week4.friday.task1;

import java.io.*;

/**
 * Created by Владислав on 31.10.2014.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MyClass ekz = new MyClass();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test"));
        outputStream.writeObject(ekz);
        outputStream.close();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test"));
        MyClass copy = (MyClass) inputStream.readObject();
        copy.other.a = 100;
        inputStream.close();
        System.out.println(ekz.other.a);
        System.out.println(copy.other.a);
    }
}
