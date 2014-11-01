package bioniclessons.week4.friday.task4;

/**
 * Created by Владислав on 31.10.2014.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Finished");
    }
}
