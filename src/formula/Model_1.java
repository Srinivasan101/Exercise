package formula;

import java.util.Scanner;

public class Model_1 {
	public static void main(String [] args) {
		Scanner Circle = new Scanner(System.in);
		System.out.println("FIND AREA OF CIRCLE");
		double Radius = Circle.nextDouble();
		double Area = Math.PI*Radius*Radius;		//by or squre
		System.out.println(Area);
	}

}
