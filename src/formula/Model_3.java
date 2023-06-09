package formula;

import java.util.Scanner;

public class Model_3 {

	public static void main(String[] args) {
		Scanner Triangle = new Scanner(System.in);
		System.out.println("FIND OUT THE AREA OF TRIANGLE");
		double Height = Triangle.nextDouble();
		double Base = Triangle.nextDouble();				//1/2 bh
		double Area = Math.pow(2, -1)*Height*Base;
		System.out.println("AREA OF THE TRIANGLE IS : "+Area);
		
		

	}

}
