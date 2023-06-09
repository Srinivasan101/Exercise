package array_task;

import java.util.Scanner;

public class Model_4 {

	public static void main(String[] args) {
		Scanner Prime = new Scanner (System.in);
		System.out.println("ENTER ARRAY SIZE");
		int Num = Prime.nextInt();
		boolean bool = false;
		int Array [] = new int [Num];
		System.out.println("ENTER ARRAY NUMBERS");
		for ( int i = 0; i < Num; i++) {
			Array[i] = Prime.nextInt();
		}
		System.out.println("GIVE THE SPECIFIC VALUE");
		int Specific = Prime.nextInt();
		for (int i = 0; i < Num ; i++) {
		if (Array[i] == Specific) {
			bool = true;
		}
		}
		if(bool) {
			System.out.println("SPECIFIC NUMBER" + Specific + " AVAIABLE");
		}else {
			System.out.println("SPECIFIC NUMBER " + Specific + "NOT AVAIAVLE ");
		}
	}

}

