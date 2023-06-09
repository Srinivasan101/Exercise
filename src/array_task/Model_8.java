package array_task;

public class Model_8 {

	public static void main(String[] arg) {
		int x [] = {10,20,30,40,50};
		int y [] = {10,60,30,70,50};
		
		for (int i = 0;i < x.length;i++) {
			for (int j = 0; j < y.length;j++) {
				if(x[i] == y[j]) {
				System.out.println("COMMON ELEMENT IS :" +x[i]);
			}
		}

	}
	}
}

