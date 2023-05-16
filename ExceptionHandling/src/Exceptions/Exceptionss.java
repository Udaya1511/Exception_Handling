package Exceptions;

public class Exceptionss {
	
	int x = 10;
	
	private void m1() {
		
		System.out.println("Value is : " + x);

	}
	
	public static void main(String[] args) throws Throwable {
		
		Exceptionss ex = new Exceptionss();
		
		ex.m1();
		
		Thread.sleep(0);
		
		int num[] = {1,2,4,8,7,9};
	       int evencount = 0;
	       int oddcount = 0;
	       
	       for (int i = 0; i < num.length; i++) {
	    	   if (num[i]%2 == 0) {
	               evencount ++;
	           } else {
	               oddcount++;
	           }
	           
	       }
	       
	       System.out.println(evencount +" "+ oddcount);
		
	}

}
