package string.org;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Model_9 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy : MM : dd , HH : mm :ss");
		String Real = now.format(formatter);
		System.out.println("THE CURRENT LOCAL TIME AND DATE IS : "+Real);
		
		

	}

}
