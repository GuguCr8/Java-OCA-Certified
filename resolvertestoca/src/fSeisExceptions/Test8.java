package fSeisExceptions;

public class Test8 {
	
	public static void main(String[] args) {
	
	int a = 0;
	int b = 0;
	
	try{
		
	return a / b;
	}
	catch (RuntimeException e) { 
		return -1;
	}
	catch (ArithmeticException e) {
		return 0;
	} finally { 
		System.out.print("done");
	}

	}
}
