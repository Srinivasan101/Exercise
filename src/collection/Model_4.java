package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model_4 {

	public static void main(String[] args) {
		List <String> bike = new <String> ArrayList();
		bike.add("Hero");
		bike.add("Honda");
		bike.add("Yamaha");
		bike.add("Tvs");
		bike.add("Bajaj");
		bike.add("RR");
		
		System.out.println("before sort list : " + bike);
		Collections.sort(bike);
		System.out.println("after sort list : " + bike);

	}

}
