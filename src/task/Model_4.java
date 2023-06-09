package task;

import java.util.Scanner;

public class Model_4 {

	public static void main(String[] args) {
		Scanner Sri = new Scanner (System.in);
		System.out.println("Number of Days in a Week");
		int Days = Sri.nextInt();
		System.out.println("which day you want");
		int x = Sri.nextInt();
		for(int i = x; i <= Days;i++) {
			
			if(i == 1) {
				System.out.println("SUNDAY");
				break;
			}else if(i == 2) {
				System.out.println("MONDAY");
				break;
			}else if(i == 3) {
				System.out.println("TUESDAY");
				break;
			}else if(i == 4) {
				System.out.println("WEDNESDAY");
				break;
			}else if(i == 5) {
				System.out.println("THURSDAY");
				break;
			}else if(i == 6) {
				System.out.println("FRIDAY");
				break;
			}else if(i == 7) {
				System.out.println("SATURDAY");
				break;
				
			}
		}

	}

}
