package formula;

import java.util.Scanner;

public class Model_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("FIND THE FACTORIAL NUMBER");
		int n = input.nextInt();
		 int x = 1;
		 
		 while(n!=0) {
			 x*=n;
			 n--;
			
		}
		
		System.out.println("FACTORIAL NUMBER "+ x);
	}

}
