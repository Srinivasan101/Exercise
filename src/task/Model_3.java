package task;

import java.util.Scanner;

public class Model_3 {

	public static void main(String[] args) {
		Scanner Prime = new Scanner (System.in);
		System.out.println("GIVE THE NUMBER");
		int x = Prime.nextInt();
		
		if(x<0) {
			System.out.println("THE NUMBER "+x+" IS A NEGARIVE NUMBER");
		}else {
			System.out.println("THE NUMBER "+x+" IS A POSITIVE NUMBER");
		}

	}

}
