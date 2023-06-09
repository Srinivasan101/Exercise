package array_task;

import java.util.Scanner;

public class Model_2 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("GIVE THE BIKE NAME");
		String Name = Scan.next();
		String Bike [] = {"YAMAHA","TVS","HERO","HONDA","BAJAJ"};
		for (int i = 0; i< Bike.length; i++) {
			if(Bike[i].equals(Name)) {
				System.out.println(i);
			}
		}

	}

}
