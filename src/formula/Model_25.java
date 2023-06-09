package formula;

import java.util.Scanner;

public class Model_25 {

	public static void main(String[] args) {
		Scanner Sri = new Scanner (System.in);
		System.out.println("CALCULATE POWER OF NUMBER");
		int Start = Sri.nextInt();
		int End = Sri.nextInt();
		int Number = Sri.nextInt();
		
		while(End != 0) {
			Number *= Start;
			--End;
		}
		System.out.println(Number);
	}

}
