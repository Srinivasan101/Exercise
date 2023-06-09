package array_task;

import java.util.Scanner;

public class Model_14 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in) ;
			System.out.println("FIND EVEN AND ODD NUMBER IN ARRAY");
			int num = Scan.nextInt();
			int sum = 0; int count= 0;
			int x [] = new int [num];
			
			for ( int i =0; i < num; i++) {
				x[i] = Scan.nextInt();
		}
			for (int i = 0; i < num ; i++) {
				if(x[i]%2 == 0) {
					sum++;
				}	
				 if (x[i]%2 != 0) {
						count++;	
				}
			}
				System.out.println("EVEN NUMBER IS : "+sum);
				System.out.println("ODD NUMBER IS : "+count);
	}

}

