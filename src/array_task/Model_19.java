package array_task;

public class Model_19 {

	public static void main(String[] args) {
		int [] num = {10,2,20,3,30,44,77,99,88};
		int temp; int []x;
		for ( int i = 0; i < num.length; i++) {
			for ( int j = i; j < num.length; j++) {
				if(num[i]>num[j]) {
				temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				
				}
			}
			System.out.println("ascending order :" + num[i]);
				
		}
	}
}
