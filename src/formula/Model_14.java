package formula;

import java.util.Scanner;

public class Model_14 {

	public static void main(String[] args) {
		Scanner Cube = new Scanner (System.in);
		System.out.println("FIND THE SURFACE OF THE CUBE");
		double Edge = Cube.nextDouble();
		double Surface = 6*Edge*Edge;
		System.out.println("SURFACE OF THE CUBE : " + Surface);
		

	}
}