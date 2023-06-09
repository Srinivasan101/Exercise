package method.org;

public class Model_1 {
	static int myMethod(int x, int y, int z, int c) {
		return (x + y + z )/ c;
	}
	

	public static void main(String[] args) {
		int average = myMethod(20,40,60,10);
		System.out.println(average);
		

	}

}
