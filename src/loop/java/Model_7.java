package loop.java;

public class Model_7 {

	public static void main(String[] args) {
		int x,y,z;
		
		for (int i = 1; i <= 600; i++) {
			int temp = i;
			x = temp%10;
			
			temp = temp/10;
			y = temp%10;
			
			temp = temp/10;
			z = temp%10;
			
			if(x*x*x + y*y*y + z*z*z == i) {
				System.out.println(i);
			}
			
		}
		

	}

}
