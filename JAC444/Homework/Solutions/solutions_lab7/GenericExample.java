class Type<T> {

    private T t;

    public Type(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }
}
/************************************************************************
 *  Compilation:  javac GenericExample.java
 *  Execution:    java GenericExample
 *
 *  Solution Lab 7 exercise 2
 *  Print array of any type
 *
 *  Output:
 *  A A are equals: true
 *  A B are equals: false
 *
 * @author Jordan Anastasiade
 * @version 1.0, 5 Feb 2008
 * @version 1.1, 22 Aug 2017
 ************************************************************************/
public class GenericExample {


    public <T> boolean isEqual(Type<T> g1, Type<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        GenericExample test = new GenericExample();

        Type<String> s1 = new Type<>("A");
        Type<String> s2 = new Type<>("A");
        Type<Character> c1 = new Type<>('A');
        Type<Character> c2 = new Type<>('B');

        System.out.println(s1.get() + " " + s2.get() + " are equals: " + test.<String>isEqual(s1, s2));
        System.out.println(c1.get() + " " + c2.get() + " are equals: " + test.isEqual(c1, c2));
    }
}

