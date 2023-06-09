package data_types;

import java.util.Scanner;

public class Model_18 {

	public static void main(String[] args) {
		Scanner time =new Scanner(System.in);
		System.out.println("the exact time is");
		int Second = time.nextInt();
		
		int hour = Second/3600;
		int min  = Second%3600/60;
		int sec = Second%60;
		
		System.out.printf("%d : %d : %d \n",hour,min,sec);
		
		
		

	}

}
