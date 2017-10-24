/************************************************************************
 *  Compilation:  javac SimpleRunnable.java
 *  Execution:    java SimpleRunnable
 *
 *  Example of how to create a thread using a Runnable object
 *  (an object built from a class that implements Runnable interface)
 *  The runnable object is used as param to the thread constructor
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
public class SimpleRunnable implements Runnable {
    /**
     * private string object
     */
    private String name;

    /**
     * Constructor that takes a param of type String
     *
     * @param str the name of the object
     */
    public SimpleRunnable(String str) {
        name = str;
    }

    /**
     * It implements the run from Runnable interface
     */
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + name + " " + i);
            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread " + name + " DONE!");
    }

    public static void main(String[] args) {

        // creates the thread t1 that takes a runnable obj as arg
        Thread t1 = new Thread(new SimpleRunnable("First >>>"));
        // starts the t1 thread
        t1.start();

        // creates a threads using a runnable obj
        // and starts the thread
        new Thread(new SimpleRunnable("Second <<")).start();

        // prints the string before program ends
        System.out.println("DONE ALL!");
    }
}