package loop.java;

import java.util.Scanner;

public class Model_4 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 System.out.println("enter the two numbers ");
		 int a = scan.nextInt();
		 int b = scan.nextInt();
		 int c=0;
		 for (int i = 1 ;i < a ; i++) {
			 if( a%i==0 && b%i==0)
				c=i; 
			
			 }
		 System.out.println("HCF OF THE TWO NUMBER IS : " + c);
		 }
	
		 	}


