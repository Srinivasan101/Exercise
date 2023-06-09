package method.org;

public class Model_4 {
	
	public static int Vowels(String vowel) {
		int count = 0;
		for (int i = 0 ; i < vowel.length();i++) {
		char letter = vowel.charAt(i);
		if ( letter == 'a' ||letter == 'e' ||letter == 'i' ||letter == 'o'
				||letter == 'u' ||letter == 'A' ||letter == 'E' ||letter == 'I' ||letter == 'O' ||letter == 'U') {
			count++;
		}
		}
		return count;
	}
	public static void main(String[] args) {
		String vowel = "World wide web";
		int vowels = Vowels(vowel);
		System.out.println("the number of voewls in the word is : " + vowels);
		
		

	}

	}
