package method.org;

public  class Model_3{
	public static int countWords(String quote) {
	    if (quote == null || quote.isEmpty()) {
	        return 0;
	    }
	    
	    String[] words = quote.trim().split("\\s+");
	    return words.length;
	}
	public static void main(String [] args) {
		String quote = "purpose of life to live the life of purpose by nepolin hill";
		int count = countWords(quote);
		System.out.println("The string contains " + count + " words.");

	}
	
}

