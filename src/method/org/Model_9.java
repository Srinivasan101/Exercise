package method.org;

import java.util.Scanner;

public class Model_9 {
	
	public static boolean findEven(int num) {
		return (num%2 == 0);
		
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("enter number");
	int even = scan.nextInt();
	boolean myEven = findEven(even);
	if(myEven) {
		System.out.println( even + " is Even number " );
	}else {
		System.out.println(even + " is not a Even number " );
	}
	}

}
