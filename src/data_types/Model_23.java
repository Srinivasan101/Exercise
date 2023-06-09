package data_types;

import java.util.Scanner;

public class Model_23 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int Number = Scan.nextInt();
		int Original = Number;
		int Reverse =0;
		while(Number!=0) {
			Reverse=Reverse*10+Number%10;
			Number=Number/10;
		}
		
		if(Original==Reverse) {
			System.out.println(Original+" is Palindrome number");
		}else {
			System.out.println(Original+" is Not Palindrome number");
		}
	}

}
