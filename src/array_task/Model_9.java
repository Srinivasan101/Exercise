package array_task;

public class Model_9 {

	public static void main(String[] args) {
		int [] num = {10,20,30,40,30,20,70};
		for (int i = 0; i< num.length;i++ ) {
			for (int j = i+1 ; j<num.length; j++) {
				if((num[i]== num[j]) && (i !=j)) {
					System.out.println("the fake number is: " +num[i]);
				}
			}
		}

	}
			//dup number
}
