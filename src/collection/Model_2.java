package collection;

import java.util.*;

public class Model_2 {

	public static void main(String[] args) {
		
		List<String>cars = new <String> ArrayList();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Toyato");
		cars.add("Ford");
		cars.add("Ferrari");
		cars.add("Rolls Royce");

		System.out.println("before insert :" + cars);
		
		cars.add(0, "TATA");
		cars.add(7, "Suzuki");
		
		System.out.println("after insert :" + cars);
	}

}
