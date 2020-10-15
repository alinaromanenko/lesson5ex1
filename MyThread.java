package lesson5;

public class MyThread extends Thread{
    public void run() {
        try {
            NewThread newThread = new NewThread();
            newThread.start();
            newThread.join();
            sleeper();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static synchronized void sleeper() throws InterruptedException {
        sleep(1000);
    }
}