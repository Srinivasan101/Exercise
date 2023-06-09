package formula;

import java.util.Scanner;

public class Model_2 {

	public static void main(String[] args) {
		Scanner Rectangle =new Scanner (System.in);
		System.out.println("FIND OUT THE AREA OF RECTANGLE");
		int width = Rectangle.nextInt();
		float length = Rectangle.nextFloat();		// wl
		double area = width*length;
		System.out.println(area);
		

	}

}
