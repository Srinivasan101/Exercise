package array_task;

public class Model_15 {

	public static void main(String[] args) {
		int [] num = {10,20,30,40,50,60,70,80,90,100};
		int max = num[0]; int min =num[0];
		
		for(int i = 0; i< num.length;i++) {
			 
				if(num[i] > max) {
					max = num[i];
				}
				if(num[i] < min) {
					min = num[i];
				}
			}
			System.out.println( "DIFFRENT BETWEEN NUMBER IS : " + (max-min));
		}

	}


