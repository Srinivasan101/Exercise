package data_types;

import java.util.Scanner;

public class Model_25 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("GIVE THE NUMBER");
				int Number = Scan.nextInt();
				int sum =0;
				while(Number!=0) {
					sum += Number%10;
					Number/=10;
				}
		System.out.println("DIGIT OF POSITIVE INTEGER IS : "+sum);

	}

}
