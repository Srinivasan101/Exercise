package loop.java;

import java.util.Scanner;

public class Model_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int number;
		char count;
		int even = 0;
		int odd = 0;
		
		do {
			System.out.println("enter the number");
			number = scan.nextInt();
			 
			if(number %2 == 0) {
				even+= number;
			}else {
				odd+= number;
			}	
				System.out.println("do you want continue y/n");
				count = scan.next().charAt(0);
			}while (count == 'y'  || count == 'Y' ) ;
			System.out.println("sum of even number is : " + even);
			System.out.println("sum of odd number is : " + odd);
				
			}
		
}

	


