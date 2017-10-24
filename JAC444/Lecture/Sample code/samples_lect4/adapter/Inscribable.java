/************************************************************************
 *  Compilation:  javac Inscribabel.java
 *
 *  Interface to calculate the area of a shape of type circle
 *  where the circle is inscribed in a given square
 *
 *  This is the TARGET interface for the Adapter Design Pattern
 *
 * @author Jordan Anastasiade
 * @version 1.0, 14 July 2017
 ************************************************************************/

public interface Inscribable {
    /**
     * Calculates the area of a circle inscribed in a square
     *
     * @param shape The object of type Squareable
     * @return The area of the circle inscribed in the Square
     */
    double circleArea(Squareable shape);
}

