package MultiThreading;

public class MultiThread extends Thread {

    public static void main(String[] args) {
        
        MultiThread multiThread = new MultiThread();
        multiThread.start();
    
        // Thread 2 
        MultiThread multiThread1 = new MultiThread();
        multiThread1.start();
    
        //Thread 3
        MultiThread multiThread2 = new MultiThread();
        multiThread2.start();
        
    
            
    }

@Override
public void run()
{
    for(int i=0;i<1+0;i++){
        System.out.println(i);
    }
}

}