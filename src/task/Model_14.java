package task;

import java.util.Scanner;

public class Model_14 {

	public static void main(String[] args) {
		Scanner Sri = new Scanner (System.in);
		System.out.println("ENTER THREE VALUES");
		int x = Sri.nextInt();
		int y = Sri.nextInt();
		int z = Sri.nextInt();
		
		if((x<y) && (y< z)) {
			System.out.println("NUMBERS ARE INCRESING ORDER");
		}else if ((x>y) && (y>z)){
			System.out.println("NUMBERS ARE DECRESING ORDER");
		}else if((x==y) && (y==z)) {
			System.out.println("NUMBERS ARE EQUAL");
		}else {
			System.out.println("NUMBERS ARE EITHER INCRESING NOR DECRESING ORDER");
		}
		}

	}


