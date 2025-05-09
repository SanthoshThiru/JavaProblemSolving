package MultiThreading;

public class ThreadRunnable implements Runnable {

    public static void main(String[] args) {

        ThreadRunnable threadRunnable = new ThreadRunnable();
        Thread thread = new Thread(threadRunnable);
        thread.start();

        
        ThreadRunnable threadRunnable1 = new ThreadRunnable();
        Thread thread1 = new Thread(threadRunnable1);
        thread1.start();

        
        ThreadRunnable threadRunnable2 = new ThreadRunnable();
        Thread thread2 = new Thread(threadRunnable2);
        thread2.start();

    }

    @Override
    public void run() {
        //System.out.println("*****************");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+" Output: "+i);
        }
        //System.out.println("*****************");
    }
}
