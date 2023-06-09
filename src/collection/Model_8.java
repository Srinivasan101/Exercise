package collection;

import java.util.ArrayList;

public class Model_8 {

	public static void main(String[] args) {
		ArrayList<String>cars = new <String> ArrayList(10);
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Toyato");
		cars.add("Suzuki");
		
		System.out.println("before comparing arraylist one :" + cars);
		
		ArrayList<String>car = new <String> ArrayList(10);

		car.add("Ford");
		car.add("BMW");
		car.add("TATA");
		car.add("Suzuki");
		System.out.println("before comparing arraylist two  :" + car);
		
		ArrayList<String>wheels = new <String> ArrayList(10);

		for(String transport : cars) 
			wheels.add(car.contains(transport) ? "Match" : "Unmatch");
			System.out.println("after comparing :" + wheels);
			
		}
		
		
		

	}


