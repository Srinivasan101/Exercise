package task;

import java.util.Scanner;

public class Model_6 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("ENTER THE FIVE VALUES");
		int count = 5;
		int x = count;
		int sum = 0; 
		while(count != 0) {
			
			int Number = Scan.nextInt();
			sum+=Number;
			count--;
		}
		int Avg = sum/x;
	
	System.out.println("SUM OF THE NUMBER VALUE IS :"+sum);
	System.out.println("AVERAGE OF THE NUMBER IS :" +Avg);
	}
}
