package loop.java;

import java.util.Scanner;

public class Model_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		        int amount;
		        int count;
		        int[] note = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		        System.out.print("Enter amount: ");
		        amount = scan.nextInt();

		        for (int i = 0; i < note.length; i++) {
		            count = amount / note[i];

		            if (count > 0) {
		                System.out.println(note[i] + " notes: " + count);
		            }

		            amount -= count * note[i];
		        }
		    }
		}
