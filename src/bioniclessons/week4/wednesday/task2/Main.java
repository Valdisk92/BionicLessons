package bioniclessons.week4.wednesday.task2;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 29.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<MyClass> myClassArrayList = new ArrayList<>();
        MyClass myClass1 = new MyClass("Vlad", 22);
        myClassArrayList.add(myClass1);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("MyClass.obj"))){
            outputStream.writeObject(myClass1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("MyClass.obj"))){
            MyClass myClass2 = (MyClass) inputStream.readObject();
            myClassArrayList.add(myClass2);
        }
        catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println(myClassArrayList);
    }
}
