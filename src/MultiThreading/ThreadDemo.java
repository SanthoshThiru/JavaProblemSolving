package MultiThreading;

public class ThreadDemo extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ThreadDemo threadDemo = new ThreadDemo();
            threadDemo.start();
        }
    }

    @Override
    public void run() {
        for (int times = 1; times <= 10; times++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", Count: " + times);
        }
    }
}