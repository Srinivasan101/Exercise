package array_task;

import java.util.Arrays;
import java.util.Set;

import java.util.TreeSet;

public class Model_18 {

	public static void main(String[] args) {
		Integer number [] = {1,1,2,3,1,4,5};
		Set <Integer> unickey = new TreeSet <Integer>();
		unickey.addAll(Arrays.asList(number));
		System.out.println("unickey : " + unickey);
		

	}

}
