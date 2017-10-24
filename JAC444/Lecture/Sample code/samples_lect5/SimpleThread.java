/************************************************************************
 *  Compilation:  javac SimpleThread.java
 *  Execution:    java SimpleThread
 *
 *  Example of how to create a thread (it inherits from Thread class)
 *
 *  Output DEPENDS ON MACHINE THAT RUNS THIS PROGRAM:
 *  DONE ALL!
 *  Thread Second << 0
 *  Thread First >>> 1
 *  Thread Second << 1
 *  Thread Second << 2
 *  Thread Second << DONE!
 *  Thread First >>> 2
 *  Thread First >>> DONE!
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 May 2000
 * @version 1.1, 09 Aug 2017
 ************************************************************************/
public class SimpleThread extends Thread {

    /**
     * Constructor that takes a param of type String
     * @param str the name of thread
     */
    public SimpleThread(String str) {
        super(str);
    }

    /**
     * It overrides the run from the Thread class
     */
    public void run() {
        for (int i = 0; i < 3; i++) {

            System.out.println("Thread " + getName() + " " + i);

            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread " + getName() + " DONE!");
    }

    public static void main(String[] args) {

        // creates the thread t1
        Thread t1 = new SimpleThread("First >>>");
        // starts the t1 thread
        t1.start();

        // creates and starts the thread whose name is
        // Second <<
        new SimpleThread("Second <<").start();

        // prints the string before program ends
        System.out.println("DONE ALL!");
    }
}