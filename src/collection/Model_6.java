package collection;

import java.util.*;
import java.util.Collections;

public class Model_6 {

	public static void main(String[] args) {
		
		ArrayList<String>cars = new <String> ArrayList(3);
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Toyato");
		cars.add("Ford");
		
		System.out.println("before incresing arraylist :" + cars);
		
		cars.ensureCapacity(3);
		
		
		cars.add("Ferrari");
		cars.add("Rolls Royce");
		cars.add("TATA");
		cars.add("Suzuki");
		System.out.println("after increasing arraylist  :" + cars);

	}

}
