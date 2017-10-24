/************************************************************************
 *  Compilation:  javac PrintArray.java
 *  Execution:    java PrintArray
 *
 *  Solution Lab 7 exercise 1
 *  Print array of any type
 *
 *  Output:
 *  1, 2, 3, 4, 5,
 *  JAC444, BTP400, EJB605, DPS903,
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/

public class PrintArray {

    public static void main(String[] args ) {

        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"JAC444", "BTP400", "EJB605", "DPS903"};

        print(integers);
        print(strings);
    }

    /**
     *
     * @param array array of type T
     * @param <T>  generic type of the elements of array
     */
    public static <T> void print(T[] array) {

        for (T x : array)
            System.out.print(x + ", ");

        System.out.println();
    }
}
