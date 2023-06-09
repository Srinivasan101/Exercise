package formula;

import java.util.Scanner;

public class Model_7 {

	public static void main(String[] args) {
		Scanner Prism = new Scanner (System.in);
		System.out.println("FIND OUT THE AREA OF PRISM");
		float Length = Prism.nextFloat();
		float Width = Prism.nextFloat();
		float Height = Prism.nextFloat();
		
		System.out.println("THE AREA OF PRISM IS : "+2*(Length*Width)+2*(Length+Width)+Height+"m\u00B2");
		
		

	}						// 2*lw+2*lw+h

}
