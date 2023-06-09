package formula;

import java.util.Scanner;

public class Model_23 {

	public static void main(String[] args) {
		Scanner Commision = new Scanner (System.in);
		System.out.println("ENTER COMMISION AMOUNT");
		float Commision_Amount = Commision.nextFloat();
		System.out.println("ENTER SALE PRICE");
		float Sale_Price = Commision.nextFloat();
		System.out.println("FIND OUT THE COMMISION PERCENTAGE");
		float Commision_Percentage = (Commision_Amount/Sale_Price)*100;
		System.out.println(Commision_Percentage);

	}

}
