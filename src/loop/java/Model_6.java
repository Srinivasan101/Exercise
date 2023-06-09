package loop.java;

import java.util.Scanner;

public class Model_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int number;
		int max = 0;
		int min = 0;
		
		while(true) {
			System.out.println("enter the numbers : (hit 0 for stop entering number)");
			number = scan.nextInt();
			if( number == 0) {
				break;
			}if(number > max) {
				max = number;
			}if(number > min) {
				min = number;
			}
		}
		System.out.println("max num is : " + max);
		System.out.println("min num is : " + min);
	}

}
