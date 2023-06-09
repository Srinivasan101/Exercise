package task;

import java.util.Scanner;

public class Model_15 {

	public static void main(String[] args) {
		Scanner Sri = new Scanner (System.in);
		System.out.println("ENTER STUDENT NAME");
		String Name = Sri.nextLine();
		System.out.println("MARK OBTAINED BY STUDENT");
		int Mark = Sri.nextInt();
		
		if((Mark >= 480) && (Mark < 500)) {
			System.out.println("A+ Grade");
		}else if((Mark >= 450) && (Mark < 480)) {
			System.out.println("A Grade");
		}else if((Mark >= 400) && (Mark < 450)) {
			System.out.println("B+ Grade");
		}else if((Mark >= 350) && (Mark < 400)) {
			System.out.println("B Grade");
		}else if((Mark >= 300) && (Mark < 350)) {
			System.out.println("C+ Grade");
		}else {
			System.out.println("C Grade");
		}
		

	}

}
