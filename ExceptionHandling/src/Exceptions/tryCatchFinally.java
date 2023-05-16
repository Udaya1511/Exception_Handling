package Exceptions;

public class tryCatchFinally {
	
	public static void main(String[] args) {
		
		try {
			int x = 20/0;
			System.out.println(x);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		finally {
			System.out.println("i will print even the exception is not handled");
		}
		
	}

}
