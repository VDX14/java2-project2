package project2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	
	//Create a logger object using log4j
	final static Logger Log = LogManager.getLogger(Test.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Log in information message to indicate application has started 
		Log.info("Application has started");
		
		//Initial try-catch block example
		try {
			//Declare an integer variable and assign it the value 6
			//Placed in try-catch block in case error occurs
			int number = 6;
			
			//Have variable divided by 2 
			int result = number / 2; 
			
			Log.info("Calculation was successful: " + result);
		
		} catch (Exception e) {
			//Catch any exceptions in the try-catch block 
			//Log the error message along with the exception details
			Log.info("An error has occured", e);
		
		} finally {
			//Used here to Log that the application has completed running
			Log.info("Application is completed");
		}
		
	}

}
