package loop.java;

import java.util.Scanner;

public class Model_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter n number");
		int n = scan.nextInt();
		
		double sum = 0;
		for ( int i = 0; i < n; i++) {
			sum += (double)1/(1*(1+i));
		}
		System.out.println("sum of n series number : " + sum);
	}

}
