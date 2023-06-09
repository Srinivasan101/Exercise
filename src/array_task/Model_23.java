package array_task;

import java.util.Scanner;

public class Model_23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in) ;
			System.out.println("find the element");
			int x = scan.nextInt();
			int [] y = new int [x];
			
			for (int i =0; i < y.length; i++) {
				y[i] = scan.nextInt();
			}
			System.out.println("enter unic element   ");
			int z = scan.nextInt();
			int c = -1;
			for (int i =0; i < x; i++) {
				if (y[i] == z) {
					c = 1;
					break;
				}
			}
			if(c ==-1) {
				System.out.println("key element not found in array");
			}else {
				System.out.println("key element found "+ c + " in the array");
				
		}

	}

}
