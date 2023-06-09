package array_task;

import java.util.Arrays;

public class Model_7 {

	public static void main(String[] args) {
		int [] Number = {10,20,30,40,50,60,70,80,90};
		System.out.println("before array :" + Arrays.toString(Number));
		int x =0;
		int i = 0;
		int j = Number.length-1;
		while(i < j) {
				x =Number[i];
				Number[i] = Number[j];
				Number[j] = x;
				i++;
				j--;
		}
					
					System.out.println( "array after reverse : "  +Arrays.toString(Number));
					
			//System.out.print(Number[i]+ " ");
			
				}
}
		

	


