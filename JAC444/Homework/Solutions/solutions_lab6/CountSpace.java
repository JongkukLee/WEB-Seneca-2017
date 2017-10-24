
import java.io.*;

/************************************************************************
 *  Compilation:  javac CountSpace.java
 *  Execution:    java CountSpace filileName
 *              or
 *                java CountSpace
 *                then by hitting [Enter]
 *                text on a single line
 *                followed by [Ctrl C]
 *
 *  Problem Lab 6 exercise 3
 *
 *  Output:
 *  x chars, y spaces (x, y depend on your input)
 *
 * @author JPL
 * @author Jordan Anastasiade
 * @version 1.1, 12 Aug 2017
 ************************************************************************/
class CountSpace {

	public static void main(String[] args) throws IOException {

		Reader in;
		if (args.length == 0)
			in = new InputStreamReader(System.in);
		else
			in = new FileReader(args[0]);

		int ch, total, spaces = 0;

		for (total = 0; (ch = in.read()) != -1; total++) {
			if (Character.isWhitespace((char) ch))
				spaces++;
		}
		System.out.println(total + " chars, " + spaces + " spaces");
	}
}
