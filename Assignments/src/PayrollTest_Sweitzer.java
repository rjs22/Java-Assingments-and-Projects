// Ryan Sweitzer
// 10-18-15
// This program demos the Payroll class

import java.util.Scanner;

public class PayrollTest_Sweitzer {

	public static void main(String[] args) {
		
		// Declare variables and objects
		int hoursWorked;
		double payRate;
		Scanner keyboard = new Scanner(System.in);
		
		// Create object of payroll class by asking for user input
		Payroll_Sweitzer firstPayroll = new Payroll_Sweitzer();
		
		System.out.print("Enter hours worked: ");
		firstPayroll.setHours(keyboard.nextInt());
		
		System.out.print("Enter pay rate: ");
		firstPayroll.setRate(keyboard.nextDouble());
		
		// Calculate gross pay
		System.out.printf("Your gross pay is: $%,.2f", firstPayroll.getGross());
	
		// Close scanner
		keyboard.close();
	}

}
