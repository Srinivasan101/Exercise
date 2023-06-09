package loop.java;

import java.util.Scanner;

public class Model_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("find sum of the number");
		int x = scan.nextInt();
		int sum =0;
		for(int i =0; i <= x ; i++) {
			sum = sum + i;
		}
		System.out.println("sum of the number is :" + sum);
	}

}
