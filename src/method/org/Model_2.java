package method.org;

import java.util.Scanner;

public class Model_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter three number");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		System.out.println("the smallest number is : " + small(x , y, z));

	}
	public static int small(int x, int y, int z) {
		
			return  Math.min(Math.min(x, y), z);

	
		}
	
	}

