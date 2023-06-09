package formula;

import java.util.Scanner;

public class Model_22 {

	public static void main(String[] args) {
		Scanner Cricket = new Scanner (System.in);
		System.out.println("Name of the player");
		String Name = Cricket.nextLine();
		System.out.println("TOTAL SCORE OF THE PLAYER");
		int Score = Cricket.nextInt();
		System.out.println("NUMBER OF DISMISAL");
		int Out = Cricket.nextInt();
		
		int Batting_Average = Score/Out;
		System.out.println("BATTING AVERAGE OF THE PLAYER IS ");
		System.out.println(Batting_Average);
		
				

	}

}
