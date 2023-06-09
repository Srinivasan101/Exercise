package formula;

import java.util.Scanner;

public class Model_24 {

	public static void main(String[] args) {
		Scanner Sri = new Scanner(System.in);
		System.out.println("DISPLAY THE POINTS");
		byte x1 = Sri.nextByte();
		byte x2 = Sri.nextByte();
		byte y1 = Sri.nextByte();
		byte y2 = Sri.nextByte();
		
		double Distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		System.out.println("DISTANCE BETWEEN TWO POINTS IS : "+ Distance);
		

	}

}
