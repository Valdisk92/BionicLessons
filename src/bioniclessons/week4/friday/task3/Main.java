package bioniclessons.week4.friday.task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Владислав on 31.10.2014.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println(System.getProperty("my.property"));
        setProps();
    }

    private static void setProps() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("my.properties"));
        System.out.println(properties.getProperty("author"));
        properties.setProperty("author","Other author");
        properties.store(new FileWriter("my.properties"), "My configuration");
        System.out.println(properties.getProperty("author"));
    }
}
