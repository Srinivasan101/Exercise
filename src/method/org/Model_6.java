package method.org;

import java.util.Scanner;

public class Model_6 {
	public static boolean leapYear(int year) {
	    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter value");
		int year = scan.nextInt();
		boolean Leap = leapYear(year);
		if (Leap) {
		    System.out.println(year + " is a leap year!");
		}
		else {
		    System.out.println(year + " is not a leap year.");
		}


	}

}
