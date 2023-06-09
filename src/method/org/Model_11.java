package method.org;

public class Model_11 {
	
	public static void primeNumber() {
		System.out.println("enter prime number 1 to 20 ");
		for(int i = 2; i <= 20 ; i++) {
			boolean bool = true;
			for (int j = 2; j < i; j++) {
				if ( i % j == 0) {
					bool = false;
					break;
				}
			}
			if (bool) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		primeNumber();
	}

}
