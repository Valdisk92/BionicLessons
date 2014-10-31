package bioniclessons.week4.friday.task2;

import java.io.*;

/**
 * Created by Владислав on 31.10.2014.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String FNAME = "ser";
        Sub sub = new Sub();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FNAME));
        outputStream.writeObject(sub);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FNAME));
        Sub newSub = (Sub) inputStream.readObject();
        inputStream.close();
    }
}

class Base {
    Base() {
        System.out.println("b");
    }
}

class Sub extends Base implements Serializable {
    Sub() {
        System.out.println("s");
    }
}
