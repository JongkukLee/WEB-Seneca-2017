import java.util.Arrays;

/************************************************************************
 *  Compilation:  javac Book.java
 *  Execution:    java Book
 *
 *  Explains shallow cloning
 *
 *  Output:
 *  Book title=JavaCourse [Peter L., Jordan A.]
 *
 * @author Jordan Anastasiade
 * @version 1.0, 05 Aug 2017
 ************************************************************************/

public class Book implements Cloneable {

    String title;
    String[] authors;
    int ISBN;

    public Book(String title, String[] authors, int ISBN) {
        this.title = title;
        this.authors = authors;
        this.ISBN = ISBN;
    }

    public static void main(String[] args) {
        String[] sa = new String[]{"Peter L.", "Jordan A."};
        Book course = new Book("JavaCourse", sa, 94825321);

        try {
            Book copyCourse = (Book) course.clone();
            System.out.println(copyCourse);

        } catch (CloneNotSupportedException e) {
            System.out.println("catch " + e.getMessage() + " not cloned !!!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        if (ISBN != book.ISBN) return false;
        if (!Arrays.equals(authors, book.authors)) return false;
        if (!title.equals(book.title)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + Arrays.hashCode(authors);
        result = 31 * result + ISBN;
        return result;
    }

    @Override
    public String toString() {
        return "Book title=" + title + " " + Arrays.toString(authors);
    }

    /**
     * Example of shallow cloning
     * it invokes super class clone method
     *
     * @return the cloned object of type Object
     * @throws CloneNotSupportedException
     */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
