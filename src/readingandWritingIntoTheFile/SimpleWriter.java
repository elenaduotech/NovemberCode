package readingandWritingIntoTheFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SimpleWriter {

	public static void main(String[] args){
		File f = new File("C:\\Users\\Elena P\\Desktop\\New folder\\New Text Document.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(f);// I created a new file and opened a connection to it
			pw.print("Hello");
		pw.print(" World");
		pw.println();
		pw.println("This is another line");
		
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {		
			pw.close();
		}
	}

}
