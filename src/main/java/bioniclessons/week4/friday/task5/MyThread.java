package bioniclessons.week4.friday.task5;

/**
 * Created by Владислав on 31.10.2014.
 */
public class MyThread extends Thread {

    MyThread() {
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + " Finished!");
    }
}
