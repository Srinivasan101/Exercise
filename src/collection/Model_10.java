package collection;

import java.util.ArrayList;
import java.util.List;

public class Model_10 {

	public static void main(String[] args) {
		List <String> bike = new <String> ArrayList();
		bike.add("Hero");
		bike.add("Honda");
		bike.add("Yamaha");
		bike.add("Tvs");
		bike.add("Bajaj");
		bike.add("RR");
		
		System.out.println("before joining arraylist : " + bike);
		
		List<String>cars = new <String> ArrayList();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Toyato");
		cars.add("Ford");
		cars.add("Ferrari");
		cars.add("Rolls Royce");
		cars.add("TATA");
		cars.add("Suzuki");
		
		System.out.println("After joining ArrayList :" + cars);
		
		ArrayList<String>transport = new <String> ArrayList();
		transport.addAll(bike);
		transport.addAll(cars);
		
		System.out.println("New ArrayList : " + transport);
		

		
		

		
	}

}
