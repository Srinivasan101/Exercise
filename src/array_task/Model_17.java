package array_task;

import java.util.Arrays;

public class Model_17 {

	public static void main(String[] args) {
		int [] array = {10,20,30,40,50};
		int sum = 0; 
		int x =array[ array.length -1];
		//int [] x = new int [] {};
		for (int i =array.length -1; i >0 ;i--) {
			array[i] = array[i-1];
			}
			array[sum] = x;
		
		System.out.println(Arrays.toString(array));
		}
}




