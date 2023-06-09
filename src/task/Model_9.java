package task;

import java.util.Scanner;

public class Model_9 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("GIVE THE N NUMBERS");
		int n = Scan.nextInt();
		int sum = 0; int num =0;

		for(int i = 1; i <= n;i++) {
			if(i%2 == 1) {
				sum=sum+i;	
			}	
		}
		System.out.println(sum);
	}
}
