package method.org;

import java.util.Scanner;

public class Model_12 {
	
		    public static void main(String[] args) {
		        Scanner scan = new Scanner (System.in);
		        System.out.println("find gcd and lcm");
		        int x = scan.nextInt();
		        int y = scan.nextInt();
		        System.out.println("The GCD of " + x + " and " + y + " is " + findGCD(x, y));
		        System.out.println("The LCM of " + x + " and " + y + " is " + findLCM(x, y));
		    }

		    public static int findGCD(int x, int y) {
		        int gcd = 1;
		        for(int i = 1; i <= x && i <= y; ++i)
		        {
		            // Checks if i is a common factor of num1 and num2
		            if(x % i==0 && y % i==0)
		                gcd = i;
		        }
		        return gcd;
		    }

		    public static int findLCM(int x, int y) {
		        int lcm = (x * y) / findGCD(x, y);
		        return lcm;
		    }
		}


	


