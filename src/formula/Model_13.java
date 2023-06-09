package formula;

import java.util.Scanner;

public class Model_13 {

	public static void main(String[] args) {
		Scanner Cylindor = new Scanner(System.in);
		System.out.println("FIN D THE SURFACE OF THE CYLINDOR");
		double Radius = Cylindor.nextDouble();
		double Height = Cylindor.nextDouble();
		
		double Surface = 2*Math.PI*Height*Radius+2*Math.PI*Radius*Radius;
		System.out.println("SURFACE OF THE CYLINDOR : " + Surface);
		

	}					// 2 by or h +2 by r squre

}
