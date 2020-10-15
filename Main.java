package lesson5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread.sleep(600);
        System.out.println(thread.getState());
        BlockedThread blocker = new BlockedThread();
        blocker.start();
        Thread.sleep(800);
        System.out.println(thread.getState());
        Thread.sleep(4000);
        thread.interrupt();
        System.out.println(thread.getState());
        }
}
