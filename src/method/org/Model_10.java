package method.org;

import java.util.Scanner;

public class Model_10 {
	public static boolean palindrome(int num) {
	    int reverse = 0;
	    int realNumber = num;
	    
	    while (realNumber > 0) {
	        int balance = realNumber % 10;
	        reverse = reverse * 10 + balance;
	        realNumber = realNumber / 10;
	    }
	    
	    return (reverse == num);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in) ;
		System.out.println("enter number");
		int Number = scan.nextInt();
		boolean realPalindrome = palindrome(Number);
		if (realPalindrome) {
		    System.out.println(Number + " is a palindrome");
		} else {
		    System.out.println(Number + " is not a palindrome");
		}

		

	}

}
