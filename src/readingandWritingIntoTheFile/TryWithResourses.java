package readingandWritingIntoTheFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWithResourses {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Elena P\\Desktop\\New folder\\New Text Document.txt");
		
		try (PrintWriter pw = new PrintWriter(f);
				FileInputStream sva = new FileInputStream("fgjhdsjdhasdaskjdsakj")){// I created a new file and opened a connection to it
			
			pw.print("Hello");
		pw.print(" World");
		pw.println();
		pw.println("This is another line");
		
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}

}
