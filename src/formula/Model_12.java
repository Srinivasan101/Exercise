package formula;

import java.util.Scanner;

public class Model_12 {

	public static void main(String[] args) {
		Scanner Cubiod = new Scanner (System.in);
		System.out.println("FIND THE SURFACE OF THE CUBIOD");
		float Height = Cubiod.nextFloat();
		float Length = Cubiod.nextFloat();
		float Width = Cubiod.nextFloat();
		
		double Surface = 2*Length*Width+2*Length*Height+2*Width*Height;
		
		System.out.println("SURFACE AREA OF THE CUBIOD : "+ Surface+"cm\u00B2");
		

	}

}						//2*lw+2*lw+2*wh
