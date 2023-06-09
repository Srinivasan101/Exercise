package array_task;

import java.util.Arrays;

public class Model_16 {

	public static void main(String[] args) {
		int [] array = {1,0,1,0,1,0,1,0,1,1,1,0,0};
		int x =0;
		for(int i =0; i< array.length; i++) {
			if(array[i] == 0) {
				array[x++] = array[i];
			}
		}
			 while(x < array.length) {
			array[x++] = 1;
				
			}
		
		System.out.println(Arrays.toString(array));
	}

}
