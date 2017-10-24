/************************************************************************
 *  Compilation:  javac Client.java
 *  Execution:    java Client
 *
 *  This class uses an Adapter object
 *  to calculate the area of a circle inscribed in an square.
 *  1. Create the adaptee (Square object)
 *  2. Create the adapter (CircleToSquareAdapter object)
 *  3. Invoke the adapter method
 *
 *  Output:
 *  The Area of the circle inscribed in the [Square width=2.0] is 3.14159
 *
 * @author Jordan Anastasiade
 * @version 1.0, 14 July 2017
 ************************************************************************/
public class Client {

    public static void main(String[] args) {

        /* create an object of type Squareable */
        Squareable square = new Square(2.0);

        /**
         * create an object of type Inscribable
         * as an adapter to calculate the circle area
         */
        Inscribable adapter = new CircleToSquareAdapter(square);


        //use the adapter and calculate the area of the circle inscribed
        double area = adapter.circleArea(square);
        System.out.println("The Area of the circle inscribed in the" +
                " [" + square + "] is " + area);
    }
}
