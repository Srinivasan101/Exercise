package formula;

import java.util.Scanner;

public class Model_8 {

	public static void main(String[] args) {
		Scanner Sphere = new Scanner (System.in);
		System.out.println("FIND THE VOLUME OF SPHERE");
		byte Radius = Sphere.nextByte();
		System.out.println("VOLUME OF THE SPHERE IS : "+ (4.0/3.0)*Math.PI*Radius*Radius*Radius);
		

	}						//4/3 by or cube

}
