package readingandWritingIntoTheFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromResumeAndCountOccurenceOfAWord {

	public static void main(String[] args) throws FileNotFoundException {
		String word = "Experience";
		
		int count = 0;
		File f = new File("Resume.txt");
		Scanner sc = new Scanner(f);  
		while(sc.hasNext()) {
			if(sc.next().equalsIgnoreCase(word)) {
				count++;
			}
		}
System.out.println(count);
	}

}
