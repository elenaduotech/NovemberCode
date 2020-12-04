package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo2 {
public static void main(String[] args) {
	
	try {
	FileReader f = new FileReader("C://user//rt.txt");}
	catch (FileNotFoundException e){
	System.out.println("I found exception");
	}
	
	System.out.println("Hi");
	
	String myStr = "good";
	char [] myCharArr = {'g', 'o', 'o', 'd'};
	
	String newStr = null;
	for(char ch: myCharArr) {
		newStr = newStr+ch;
	}
	System.out.println((newStr == myStr)+" " +(newStr.equals(myStr)));
	float f = -123;
	System.out.println(f);
	float d = 2*1.5f;
}
}
