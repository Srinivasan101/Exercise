package array_task;

import java.util.Scanner;

public class Model_24 {

	public static void main(String[] args) {
		Scanner mark = new Scanner (System.in);
		System.out.println("student name");
		String name = mark.nextLine();
		System.out.println("total subject ");
		int size = mark.nextInt();
		int marks [] = new int [size]; 
		int sum = 0; int count =0;
		System.out.println("mark obtained by student");
		for(int i = 0; i < size;i++ ) {
			marks[i] = mark.nextInt();
		}
		for (int j = 0; j < size ; j++) {
			sum += marks[j];
			count++;
		}
		System.out.println("total : "+sum);
		float avg = sum/count;
		System.out.println("Average of the student is : " + avg);
	}
 
}
