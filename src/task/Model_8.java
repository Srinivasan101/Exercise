package task;

import java.util.Scanner;

public class Model_8 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("ENTER THE NUMBER");
		int Cube = Scan.nextInt();
		for(int i = 1;i<=Cube;i++) {
			System.out.println("the cube of the number = "+i*i*i);
		}
		

	}

}
