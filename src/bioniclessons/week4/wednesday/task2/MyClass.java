package bioniclessons.week4.wednesday.task2;

import java.io.Serializable;

/**
 * Created by Владислав on 29.10.2014.
 */
public class MyClass implements Serializable {
    String name;
    int a;

    public MyClass(String name, int a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", a=" + a +
                '}';
    }
}
