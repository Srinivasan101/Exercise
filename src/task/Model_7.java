package task;

import java.util.Scanner;

public class Model_7 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("HOW MANY NUMBERS DO YOU WANT");
		int Natural = Scan.nextInt();
		for(int i = 1; i < Natural;i++) {
			
			System.out.println( "THR NATURAL NUMBER IS : " +i);
		}

	}

}
