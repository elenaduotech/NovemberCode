package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException  {

//   try {
//	FileInputStream fi = new FileInputStream("C://User//Desktop//file.txt");
//} catch (FileNotFoundException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
		FileInputStream fi = new FileInputStream("C://User//Desktop//file.txt");
		
		
	}

}
