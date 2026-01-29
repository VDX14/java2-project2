package project2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initial try-catch block example
		try {
			//Declare an integer variable and assign it the value 4
			int number = 4;
			//Attempt to divide by zero, which will cause exception
			int result = number / 0; 
			
			System.out.println("Result: " + result);
		
		} catch (ArithmeticException e) {
			//Print this message to console
			System.out.println("Error: Unable to divide by zero");
		
		} finally {
			System.out.println("The program is finished executing");
		}
		
	}

}
