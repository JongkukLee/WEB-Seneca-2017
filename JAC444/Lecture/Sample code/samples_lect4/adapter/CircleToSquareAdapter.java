import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

/************************************************************************
 *  Compilation:  javac CircleToSquareAdapter.java
 *
 *  This class is the ADAPTER class for the Adapter Design Pattern
 *
 *  It knows how to calculate the area of a circle inscribed in a square
 *  based ONLY on the Squareable object
 *
 *  It implements the Inscribable interface (the Target interface)
 *
 *  It is composed with the Squareable type (the Adaptee component)
 *  All the requests get delegated to the Adaptee (the Squareable)
 *
 * @author Jordan Anastasiade
 * @version 1.0, 14 July 2017
 ************************************************************************/
public class CircleToSquareAdapter implements Inscribable {

    /**
     * the immutable adaptee object of type Squareable
     **/
    private final Squareable shape;

    /**
     * Constructor - it builds an object of type adapter
     *
     * @param shape a Squareable object
     */
    public CircleToSquareAdapter(Squareable shape) {
        this.shape = shape;
    }

    /**
     * Calculate the area of a circle inscribed in a square
     *
     * @param shape the object of type Square
     * @return the area of the circle.
     */

    @Override
    public double circleArea(Squareable shape) {

        double area = shape.squareArea();
        double width = sqrt(area);

        return Math.pow(width / 2.0, 2.0) * PI;
    }
}
