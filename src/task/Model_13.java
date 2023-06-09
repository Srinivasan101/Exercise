package task;

import java.util.Scanner;

public class Model_13 {
	public static void main(String [] args) {
		Scanner Scan = new Scanner (System.in);
		System.out.println("GIVE THREE NUMBERS");
		
		int Num1 = Scan.nextInt();
		int Num2 = Scan.nextInt();
		int Num3 = Scan.nextInt();
		
		int [] Sri = {Num1,Num2,Num3};
		
			if((Sri[0] == Sri[1]) && (Sri[0] == Sri[2])) {
					System.out.println("THREE NUMBERS ARE EQUAL");
				}else {
					System.out.println("THREE NUMBERS ARE NOT EQUAL");
				}
			}
		}
		
		
	


