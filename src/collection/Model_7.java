package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model_7 {

	public static void main(String[] args) {
		List<String>cars = new <String> ArrayList();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Toyato");
		cars.add("Ford");
		cars.add("Ferrari");
		cars.add("Rolls Royce");
		cars.add("TATA");
		cars.add("Suzuki");
		
		System.out.println("Listout the cars :" + cars);
		
		Collections.reverse(cars);
		
		System.out.println("after reverse the element :" + cars);


	}

}
