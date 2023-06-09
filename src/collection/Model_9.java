package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model_9 {

	public static void main(String[] args) {
		List <String> bike = new <String> ArrayList();
		bike.add("Hero");
		bike.add("Honda");
		bike.add("Yamaha");
		bike.add("Tvs");
		bike.add("Bajaj");
		bike.add("RR");
		
		System.out.println("before swap list : " + bike);
		
		Collections.swap(bike, 1, 3);
		
		System.out.println("after swap list : " + bike);



	}

}
