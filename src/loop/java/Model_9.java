package loop.java;

import java.util.Scanner;

public class Model_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in);
		System.out.println("enter term");
		int term = scan.nextInt();
		int x = 0; int y = 1;
		for (int i = 1; i <= term; i++) {
			int z = x + y;
			x = y;
			y = z;
		System.out.println("fabonic series of given number is : "+ x + " ");
	}
	}
}
