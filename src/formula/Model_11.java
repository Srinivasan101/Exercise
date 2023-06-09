package formula;

import java.util.Scanner;

public class Model_11 {

	public static void main(String[] args) {
		Scanner Cone = new Scanner(System.in);
		System.out.println("FIND THE VOLUME OF THE CONE");
		double Radius = Cone.nextDouble();
		double Height = Cone.nextDouble();
		
		double Volume = Math.PI*Radius*Radius*Height/3;
		System.out.println("VOLUME OF THE CONE : " + Volume);

	}
							// by or squre h by 3
}
