package task;

import java.util.Scanner;

public class Model_5 {

	public static void main(String[] args) {
		Scanner Leap = new Scanner (System.in);
		System.out.println("ENTER THE YEAR");
		int Year = Leap.nextInt();
	
		
		if((Year%400 == 0)||((Year%4 == 0) && (Year%100 != 0))) {
			System.out.println(Year + " IS A LEAP YEAR");
		}else {
			System.out.println(Year + " IS NOT A LEAP YEAR");
		}

	}

}
