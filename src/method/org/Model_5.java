package method.org;

import java.util.Scanner;

public class Model_5 {

	public static int findDigit(int number) {
			int sum =0;
			while(number != 0) {
				int num = number%10;
				sum  += num;
				number/=10;
			}
			return sum;
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			System.out.println("enter number");
			int number = scan.nextInt();
			int digit = findDigit(number);
			System.out.println("sum of the digit is : " + digit);
	}

}
