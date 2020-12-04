package exceptions;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception   {
		String testResult = "pass";
		if (testResult.equals("fail")) {
			System.out.println("Test failed");
			throw new TestResultFailException();
		}
throw new Exception ("Exception happened because of test failure");
	}

}
