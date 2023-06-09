package method.org;

import java.util.Scanner;

public class Model_8 {
	
	public static double areaOfPentagon(double side) {
	    double perimeter = 5 * side;
	    double apothem = side / (2 * Math.tan(Math.PI / 5));
	    double area = 0.5 * perimeter * apothem;
	    return area;
	}

	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in) ;
		System.out.println("enter number");
		double side = scan.nextDouble();
		double area = areaOfPentagon(side);
		System.out.println("The area of the pentagon is " + area);

	}
}
