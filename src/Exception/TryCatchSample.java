package Exception;

public class TryCatchSample {
	
	//public class ExceptionExample {
	    public static void checkAge(int age) throws ArithmeticException {
	        if (age < 18) {
	          throw new ArithmeticException("arith exception");
	        	//System.out.println("excpetion");
	        } else {
	            System.out.println("Access granted - You are old enough!");
	        }
	    }

	    public static void main(String[] args) {
	       try {
	            checkAge(15); // This will throw an exception
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    	//checkAge(4);
	    }
	//}

}
