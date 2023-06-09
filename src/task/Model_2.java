package task;
import java.util.*;
public class Model_2 {

	public static void main(String[] args) {
		Scanner Sri = new Scanner (System.in);
			System.out.println("MONTH NAME");
			String Month = Sri.nextLine();
			System.out.println("YEAR");
			int Year = Sri.nextInt();
			long Days_in_Month = 0;
			
			switch (Month) {
			case "January":
					Days_in_Month = 31;
					break;
			case "Febuary":
				 if((Year%400 ==0)||((Year%4 == 0) && (Year%100 !=0))) {
					 System.out.println(Days_in_Month = 29);
				 }else {
					 System.out.println(Days_in_Month = 28);
				 }
			case "March":
					Days_in_Month =31;
					break;
			case "April":
					Days_in_Month =30;
					break;
			case "May":
				 	Days_in_Month =31;
				 	break;
			case "June":
					Days_in_Month =30;
					break;
			case "July":
					Days_in_Month =31;
					break;
			case "August":
					Days_in_Month =30;
					break;
			case "Septembar":
					Days_in_Month =31;
					break;
			case "October":
					Days_in_Month =30;
					break;
			case "November":
					Days_in_Month =31;
					break;
			case "December":
					Days_in_Month =30;
					break;
			}
			System.out.println("Days in a month is : "+ Days_in_Month+" in a year "+ Year);		
			
	}		
		

}
