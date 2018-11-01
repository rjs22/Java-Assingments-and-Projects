// Ryan Sweitzer
// 10-18-15
// This class will allow objects of payroll to be created

public class Payroll_Sweitzer {

	// Declare fields
	private int hoursWorked;
	private double payRate;
	
	// Constructor
	Payroll_Sweitzer(){
		hoursWorked = 0;
		payRate = 0;
	}
	
	Payroll_Sweitzer(int hw, double pr){
		hoursWorked = hw;
		payRate = pr;
	}
	
	// Setters / Mutators
	public void setHours(int hw){
		hoursWorked = hw;
	}
	
	public void setRate(double pr){
		payRate = pr;
	}
	
	// Getters / Accessors
	public int getHours(){
		return hoursWorked;
	}
	
	public double getRate(){
		return payRate;
	}
	
	public double getGross(){
		if(hoursWorked > 40)
		{
			return (hoursWorked * payRate) + (hoursWorked - 40) * (payRate * .5);
		}
		else return (payRate * hoursWorked);
	}
}

