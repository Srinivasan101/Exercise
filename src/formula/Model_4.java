package formula;

import java.util.Scanner;

public class Model_4 {

	public static void main(String[] args) {
		Scanner Equal_Triangle = new Scanner(System.in);
		System.out.println("FIND OUT THE AREA OF EQUILATERAL TRIANGLE");
		short Area = Equal_Triangle.nextShort();
															//root of 3 / 4 r squre
		System.out.println(Math.sqrt(3)/4*Area*Area);
		

	}

}
