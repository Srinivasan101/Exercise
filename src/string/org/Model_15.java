package string.org;

public class Model_15 {

	public static void main(String[] args) {
		String Name = "This \nis my \nGame";
		int Number = 1;
		
		for(int i = 0; i < Name.length(); i++) {
			if(Name.charAt(i) == '\n'){
				Number++;
			}
		}
		System.out.println("STRING LINE : "+ Name);
		System.out.println("NUMBER COUNT :"+ Number);
	}

}
