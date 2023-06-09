package data_types;

import java.util.Scanner;

public class Model_7 {
	public static void main(String [] args) {
		Scanner Sri = new Scanner (System.in);
		System.out.println("CHANGE DECIMAL TO BINARY");
		int myDecimal = Sri.nextInt();
		String Binary = Integer.toBinaryString(myDecimal);
		System.out.println("THE BINARY VALUE IS :" + Binary);
		
		
		
		
	}

}
