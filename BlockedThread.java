package lesson5;

import static lesson5.MyThread.sleeper;

public class BlockedThread extends Thread{

    public void run() {
        try {
            sleeper();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
