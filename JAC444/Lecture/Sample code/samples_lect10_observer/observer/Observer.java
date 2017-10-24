/************************************************************************
 *  Compilation:  javac Observer.java
 *
 *  The Observer contract of the Observer Design Pattern
 *
 ************************************************************************/
public interface Observer<T> {
    /**
     * method invoked by Observable when its state changed
     */
    public void update();
}
