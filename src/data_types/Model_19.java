package data_types;

public class Model_19 {

	public static void main(String[] args) {
		        int limit = 100;
		        System.out.println("Prime numbers up to " + limit + " are:");
		        for (int i = 2; i <= limit; i++) {
		            int count = 0;
		            for (int j = 2; j < i; j++) {
		                if (i % j == 0) {
		                    count++;
		                    
		                }
		            }
		            if (count == 0) {
		                System.out.print(i + " ");
		            }
		        }
		    }
		}



