package data_types;

import java.util.Scanner;

public class Model_8 {
	public static void main(String [] args) {
		Scanner Sri = new Scanner (System.in);
		System.out.println("CHANGE BINARY TO DECIMAL");
		String Binary = Sri.nextLine();
		int myBinary = Integer.parseInt(Binary ,2);
		System.out.println("THE BINARY NUMBER IS : "+ myBinary);
		
		
	}

}
