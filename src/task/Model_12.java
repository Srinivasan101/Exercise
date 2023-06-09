package task;

import java.util.Scanner;

public class Model_12 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("COUNT THE DIGIT OF THE NUMBER");
		/*int Num = Scan.nextInt();
		int Number = String.valueOf(Num).length();
		System.out.println( "THE DIGIT OF THE NUMBER IS : "+Number);*/
		
		
						//	(OR)
		int Num = Scan.nextInt();
		int sum = 0;
		while(Num > 0) {
			Num= Num/10;
			sum++;
			
		}
		System.out.println("THE DIGIT OF THE NUMBER IS : "  + sum);
	}

}
