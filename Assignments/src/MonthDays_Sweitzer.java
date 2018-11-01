
public class MonthDays_Sweitzer {
	
	// Declare fields
	private int month;
	private int year;
	
	// Constructor
	MonthDays_Sweitzer(){
		month = 0;
		year = 0;
	}
	
	MonthDays_Sweitzer(int mo, int yr){
		month = mo;
		year = yr;
	}
	
	// Setters / Mutators
	public void setMonth(int mo){
		month = mo;
	}
	
	public void setYear(int yr){
		year = yr;
	}
	
	// Getters / Accessors
	public int getMonth(){
		return month;
	}
	
	public double getYear(){
		return year;
	}
	
	public double getNumberOfDays(){
		if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			return 30;
		}
		else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			return 31;
		}
		else if(month == 2 && (year % 100==0) && (year % 400==0))
		{
			return 29;
		}
		else if(month == 2 && (year % 100!=0) && (year % 4==0))
		{
			return 29;
		}
		else return 28;
		}
		
	}





