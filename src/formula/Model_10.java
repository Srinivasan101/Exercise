package formula;

import java.util.Scanner;

public class Model_10 {

	public static void main(String[] args) {
		Scanner Cuboid = new Scanner (System.in);
		System.out.println("FIND THE VOLUME OF CUBOID");
		short Length = Cuboid.nextShort();
		short Height = Cuboid.nextShort();
		short Bredth = Cuboid.nextShort();
		
	    double Volume = Length*Bredth*Height;
		System.out.println("VOLUME OF THE CUBOID IS : "+Volume);

	}

}				//lbh
