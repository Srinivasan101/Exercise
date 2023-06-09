package formula;

import java.util.Scanner;

public class Model_20 {

	public static void main(String[] args) {
		Scanner Mark = new Scanner (System.in);
		System.out.println("ENTER  STUDENT NAME : ");
		String Name = Mark.nextLine();
		System.out.println("How many semaster do you have");
		int numSemaster = Mark.nextInt();
		System.out.println("List out your Tamil mark");
		int Tamil = Mark.nextInt();
		System.out.println("List out your English mark");
		int English = Mark.nextInt();
		System.out.println("List out your Maths mark");
		int Maths = Mark.nextInt();
		System.out.println("List out your Science mark");
		int Science = Mark.nextInt();
		System.out.println("List out your Social mark");
		int Social = Mark.nextInt();

		int totalavg = (Tamil+English+Maths+Science+Social)/5;
		
		double sgpa [] = new double[numSemaster];
		
		for(int i = 0; i < numSemaster;i++) {
			System.out.printf("Enter SGPA for Semester %d: ", i + 1);
			sgpa[i] = Mark.nextDouble();
		}
		double cgpa =0.0;
		for( int i = 0; i < numSemaster; i++) {
			cgpa = cgpa+sgpa[i];
		}
		cgpa = cgpa/numSemaster;
		double percentage = cgpa*9.5;
		System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.printf("Percentage: %.2f\n", percentage);
		
	}

}
