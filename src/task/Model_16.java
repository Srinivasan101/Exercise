package task;

import java.util.Scanner;

public class Model_16 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("ENTER TWO NUMBERS");
		int x = Scan.nextInt();
		int y = Scan.nextInt();
		String Operator = Scan.next();
				
		if ( Operator.equals("+")) {
			System.out.println(x+y);
		}else if(Operator.equals("-") ) {
			System.out.println(x-y);
		}else if(Operator.equals("*")) {
			System.out.println(x*y);
		}else if(Operator.equals("/")) {
			System.out.println(x/y);
		}
	
		
		
	
	
		
		

	}

}
