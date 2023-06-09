package task;

import java.util.Scanner;

public class Model_1 {

	public static void main(String[] args) {
		Scanner Great = new Scanner(System.in);
		System.out.println("GET THREE NUMBERS FROM USERS");
		int X = Great.nextInt();
		int Y = Great.nextInt();
		int Z = Great.nextInt()	;	
		
		int [] Sri = {X,Y,Z};
		int Max = Sri[0];
		for (int i = 0; i <Sri.length; i++) {
			if(Sri[i] > Max ) {
				Max = Sri[i];
			
			}
		}
		System.out.println("THE GREATEST NUMBER IS : "+ Max);
	}
	
}
			
			
		
	
		
		/*int [] Sri = {5,10,4,2,15,34,9,54,23};
		
		int Max = Sri[0];
		for (int i = 1; i < Sri.length; i++) {
			if(Sri[i] > Max ) {
				Max = Sri[i];
			}
		}
		System.out.println("THE GREATEST NUMBER IS : "+ Max);
	}

}*/
