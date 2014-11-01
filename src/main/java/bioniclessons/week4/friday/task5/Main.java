package bioniclessons.week4.friday.task5;

/**
 * Created by Владислав on 31.10.2014.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new MyThread();
            threads[i].start();
        }

        for (int i = 0; i < 5; i++) {
            threads[i].join();
        }
        System.out.println("App finished");
    }
}
