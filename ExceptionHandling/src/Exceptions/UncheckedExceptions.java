package Exceptions;

public class UncheckedExceptions {
	
	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		try {
			int x = 10/0;
			
		} catch (ArithmeticException e) {
			System.out.println("Somthing went wrong, Please check exception : " + e.getMessage());
		}
		
		System.out.println("Programm ended");
	}

}
