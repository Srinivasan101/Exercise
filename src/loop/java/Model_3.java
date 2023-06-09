package loop.java;

import java.util.Scanner;

public class Model_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in) ;
		System.out.println("reverse the numbere");
		int number = scan.nextInt();
		int reverse = 0;
		//System.out.println("enter reverse and remainder number");
		int temp = number;
		int remainder = 0;
		while(temp >0) {
			remainder = temp %10;
			reverse = reverse * 10 + remainder;
			temp/=10;
			
		}
		System.out.println("reverse number is :"+ number + "is "+ reverse);
		}

	}


