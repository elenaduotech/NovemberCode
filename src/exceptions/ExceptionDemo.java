package exceptions;

public class ExceptionDemo{
	public static void main(String[] args) {
		int a = 9;
		int b = 0;
		
		System.out.println("Before exception");
		try {
	System.out.println(a/b);
	
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception happened");
		}
	
	System.out.println("Another test are going to be exectuted");
	}
}