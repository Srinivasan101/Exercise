package data_types;

public class Model_21 {

	public static void main(String[] args) {
		int Long [] =  {8,4,7,9,1,29,45,32,13,46,93};
	int Even =0; int Odd =0;
		for(int i = 0;i<Long.length;i++) {
			if(Long[i]%2==0) {
				Even++;
			}	
			if(Long[i]%2!=0) {
				Odd++;
			}
				
			}
		
		System.out.println("EVEN NUMBERS : "+Even);
		System.out.println("ODD NUMBERS : "+Odd);
		
		}
		

	}


