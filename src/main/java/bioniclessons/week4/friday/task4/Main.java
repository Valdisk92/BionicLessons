package bioniclessons.week4.friday.task4;

import java.util.concurrent.TimeUnit;

/**
 * Created by Владислав on 31.10.2014.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        int i = 0;
        Thread thread = new Thread(new MyThread());
        thread.start();
        thread.join();
        System.out.println("App finished");
    }
}
