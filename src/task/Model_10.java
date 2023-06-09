package task;

import java.util.Scanner;

public class Model_10 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("MULTIPLICATION TABLE");
		byte num = Scan.nextByte();
		for(int i = 1; i <= 20 ; i++)
			
			System.out.println(num + "*"+ i + "=" + num*i);

	}

}
