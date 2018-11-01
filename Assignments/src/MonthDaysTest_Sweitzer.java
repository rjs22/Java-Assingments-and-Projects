// Ryan Sweitzer
// 11-4-15
// This program will test the MonthDays class

import java.util.Scanner;

public class MonthDaysTest_Sweitzer {

	public static void main(String[] args) {
		
		// Declare variables and objects
				int month;
				int year;
				Scanner keyboard = new Scanner(System.in);
				
				// Create object of payroll class by asking for user input
				MonthDays_Sweitzer firstMonthDays = new MonthDays_Sweitzer();
				
				System.out.print("Enter a month (1-12): ");
				firstMonthDays.setMonth(keyboard.nextInt());
				
				System.out.print("Enter a year: ");
				firstMonthDays.setYear(keyboard.nextInt());
				
				// Calculate gross pay
				System.out.printf("%.0f days", firstMonthDays.getNumberOfDays());
			
				// Close scanner
				keyboard.close();
		
		
	}

}
