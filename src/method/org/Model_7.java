package method.org;

import java.util.Scanner;

public class Model_7 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in) ;
		System.out.println("enter number");
		double a = 0.5;
		double h = scan.nextDouble();
		double b = scan.nextDouble();
		
		System.out.println("area of the triangle is : " + areaOfTriangle(a,h,b) );
		}
	public static double areaOfTriangle(double a,double h, double b) {
	
		return (a*h*b);
	}
	
	}


