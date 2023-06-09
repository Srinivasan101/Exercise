package loop.java;

import java.util.Scanner;

public class Model_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		        int positiveCount = 0;
		        int negativeCount = 0;
		        int zeroCount = 0;
		        
		        while (true) {
		            System.out.print("Enter a number (enter 0 to stop): ");
		            int number = scan.nextInt();
		            
		            if (number == 0) {
		            	zeroCount++;
		                break;
		            } else if (number > 0) {
		                positiveCount++;
		            } else if (number < 0){
		                negativeCount++;
		            }
		            
		        }
		        
		        System.out.println("Number of positive values: " + positiveCount);
		        System.out.println("Number of negative values: " + negativeCount);
		        System.out.println("Number of zero values: " + zeroCount);
		    }
		}

