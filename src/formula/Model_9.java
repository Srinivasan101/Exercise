package formula;

import java.util.Scanner;

public class Model_9 {
	public static void main(String [] args) {
		Scanner Cylindor = new Scanner(System.in);
		System.out.println("FIND TH VOLUME OF THE CYLINDOR");
		double Radious = Cylindor.nextDouble();
		double Height = Cylindor.nextDouble();
		double Volume = Math.PI*Radious*Radious*Height;
		System.out.println("VOLUME OF THE CYLINDOR : "+Volume);
	}
	
						// by r squre h
}
