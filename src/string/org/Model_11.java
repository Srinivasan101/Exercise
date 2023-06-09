package string.org;

public class Model_11 {

	public static void main(String[] args) {
		String Line ="A SMOOTH SEA NEVER MAKE ZA SKILLED SAILOR";
		char Word = 'Z';
		
		String Result = Line.replace(String.valueOf(Word), " ");
		System.out.println("Original String :"+ Line);
		System.out.println("String with " + Word + "Removed : "+Result);
		

	}

}
