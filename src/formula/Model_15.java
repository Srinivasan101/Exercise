package formula;

import java.util.Scanner;

public class Model_15 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner (System.in);
		System.out.println("AVERAGE OF TOTAL MARKS");
		short Tamil = Mark.nextShort();
		System.out.println("Tamil Mark");
		short English = Mark.nextShort();
		System.out.println("English Mark");
		short Maths = Mark.nextShort();
		System.out.println("Maths Mark");
		short Science = Mark.nextShort();
		System.out.println("Science Mark");
		short Social = Mark.nextShort();
		System.out.println("Social Mark");
		short Computer = Mark.nextShort();
		System.out.println("Computer Mark");
		
		long Total = Tamil+English+Maths+Science+Social+Computer;
		long Average = Total/6;
		
		System.out.println("average : "+ Average);
		

	}

}
