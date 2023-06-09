package array_task;

import java.util.Scanner;

public class Model_6 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("enter position");
		int x = Scan.nextInt();
		System.out.println("enter number");
		int y = Scan.nextInt();
		int Number [] = {10,20,30,50,50,60,70,80,90,100};
		Number[x]=y;
		for (int i = 0;i < Number.length;i++) {
			System.out.println(Number[i]);
			
			
		}

	}

}
