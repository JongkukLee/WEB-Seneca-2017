
import java.io.*;
/************************************************************************
 *  Compilation:  javac CopyLines.java
 *  Execution:    java CopyLines sourceFileName destinationFileName
 *
 *  Explain how to use BufferedReader, PrintWriter to copy
 *  one line as a time (a buffer)
 *  and try-with-resources (Java 7)
 *
 *  Output:
 *  nothing - check if destinationFile is created
 *
 * @author Jordan Anastasiade
 * @version 1.0, 12 May 2000
 * @version 1.1, 11 Aug 2017
 ************************************************************************/
public class CopyLines {

    public static void main(String[] args) throws IOException {

        if (args.length < 2) {
            System.out.println("usage: CopyLines source destination");
            return;
        }

        try (
                BufferedReader inputBuffer = new BufferedReader(new FileReader(args[0]));
                PrintWriter outputBuffer = new PrintWriter(new FileWriter(args[1]));
        ) {
            String line;
            while ((line = inputBuffer.readLine()) != null)
                outputBuffer.println(line);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}

