package data_types;
import java.util.Arrays;

public class Model_20 {

	public static void main(String[] args) {
		int [] Sri = {100,110,120,130,140,150,160,170,180,190,200};
		System.out.println("ARRAY : "+Arrays.toString(Sri));
		int x = Sri[0];
		Sri[0] = Sri[Sri.length-1];
		Sri[Sri.length-1] = x;
		System.out.println("new array created"+Arrays.toString(Sri) );
		

	}

}
