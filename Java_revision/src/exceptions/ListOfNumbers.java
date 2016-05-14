package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() throws IOException {
	// The FileWriter constructor throws IOException, which must be caught.
    // It is a checked exception so the code will not compile unless dealt with.
    	PrintWriter out = null;
    	try {
        	out = new PrintWriter(new FileWriter("OutFile.txt"));

        	for (int i = 0; i < SIZE; i++) {
        		// The get(int) method throws IndexOutOfBoundsException, which must be caught.
        		//  It is an unchecked exception which may lead to a runtime error if not dealt with.
        		out.println("Value at: " + i + " = " + list.get(i));
        	}
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        } finally {
            if (out != null) { 
                System.out.println("Closing PrintWriter");
                out.close(); 
            } else { 
                System.out.println("PrintWriter not open");
            } 
        }
    }
}
