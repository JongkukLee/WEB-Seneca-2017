/************************************************************************
 *  Compilation:  javac SynThread.java
 *  Execution:    java SynThread
 *
 *  Example of how to block the execution of a thread using
 *  the synchronized keyword
 *
 *  Output (partial):
 *  Thread-1 prints 1
 *  Thread-0 prints 1
 *  Thread-0 prints 2
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 May 2000
 * @version 1.1, 11 Aug 2017
 ************************************************************************/
public class SynThread implements Runnable {


    private int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    //try to synchronize this method to block other threads for executing it
    //keyword synchronized
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " prints " + arr[i]);
        }
    }

    public static void main(String args[]) {
        SynThread z = new SynThread();
        new Thread(z).start();
        new Thread(z).start();
    }
}