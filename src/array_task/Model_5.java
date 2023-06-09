package array_task;

import java.util.Scanner;

public class Model_5 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("FIND MAX AND MIN VALUE IN ARRAY");
		int Num = Scan.nextInt();
		int Value [] = new int [Num];
		System.out.println(Value.length);
		int max = Value[0];	int min = Value[0];
		for (int i = 0; i< Num; i++) {
			Value[i]= Scan.nextInt();
		}
		for (int i = 1; i< Num; i++) {
			if(Value [i] > max) {
				max = Value[i];
			}
			if(Value [i] < min) {
				min = Value[i];
		}
		}	
		
		System.out.println("MAXIMUM VALUE IS : "+ max);
		System.out.println("MINIMUM VALUE IS : "+ min);
	}
	
}


