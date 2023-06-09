package formula;

import java.util.Scanner;

public class Model_19 {

	public static void main(String[] args) {
		Scanner EB = new Scanner (System.in);
		System.out.println("In which type of eletricity bill");
		String Type = EB.nextLine();
		
		
		while (Type.equals("Home")) {
		long Home = EB.nextLong();
		
		if (Home<=500) {
		System.out.println("HOME EB BILL IS : "+ Home*1.5);
		}else if (Home >= 500) {
			System.out.println("HOME EB BILL IS : "+ Home*3.5);
		}
		}
		while(Type.equals("Factory")) {
		long Factory = EB.nextLong();
		if(Factory <= 100) {
			System.out.println("FACTORY EB BILL IS : "+ Factory*10);
		}
		}
		
	
}
}
	
	
