package formula;

import java.util.Scanner;

public class Model_21 {

	public static void main(String[] args) {
		Scanner Compound = new Scanner (System.in);
		System.out.println("ENTER THE PRINCIPAL AMOUNT");
		double Principal = Compound.nextDouble();
		System.out.println("ENTER THE ANNUAL INTEREST");
		double Interest = Compound.nextDouble();
		System.out.println("ENTER THE COMPOUND PER YEAR");
		double Compoundyear = Compound.nextDouble();
		System.out.println("ENTER THE YEAR");
		int Year = Compound.nextInt();
		
		double Amount = Principal*Math.pow(1+(Interest/Compoundyear),Compoundyear*Year);
		System.out.printf("The compound interest is %.2f", Amount );
		
		

	}

}
