package array_task;

import java.util.*;

public class Model_3 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("FIND THE AVERAGE");
		int x = Scan.nextInt();
		int y = Scan.nextInt();
		int z = Scan.nextInt();
		int sum=0;	int count =0;
		int Number[] = {x,y,z};
		for(int i = 0; i < Number.length; i++) {
			sum = sum + Number[i];
			count++;
		}
		
		int Avg = sum/count;
		System.out.println("AVERAGE IS : " +Avg);

	}

}
