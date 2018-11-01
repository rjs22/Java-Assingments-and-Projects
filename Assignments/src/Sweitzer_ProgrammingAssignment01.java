// Ryan Sweitzer
// 9-3-15
// This Program will convert Temp, Calculate energy drink consumption and print out a star pattern

public class Sweitzer_ProgrammingAssignment01
{
   public static void main( String [] args )
   {
       
      // PART I. TEMPERATURE CONVERSION
       
      //***** 1. declare any constants here
	   final double FREEZE_POINT = 32;
	   // Ansr: final int FREEZE_POINT;
     
	   //***** 2. declare temperature in Fahrenheit as an int 
	   int Tf = 54;	
	   // Ansr: tempF = 54
      
	   //***** 3. calculate equivalent Celsius temperature	
	   double Tc = ((double)5/9) * (Tf - 32);
	  	//Ansr: double tempC = (double)5/9 * (tempF - FREEZE_POINT)	
      
	   //***** 4. output the temperature in Celsius
	   System.out.println(Tc);
		// Ansr: System.out.println(tempC);										  
      
	   //***** 5. convert Celsius temperature back to Fahrenheit
	   Tf = (int) ((Tc * 9 / 5 ) + 32);
		// Ansr: tempF = (int)((tempC * 9/5) + FREEZE_POINT);		
      
	   //***** 6. output Fahrenheit temperature to check correctness
	   System.out.println(Tf);
	    // Ansr: System.out.println(tempF);
       
       
       
       
      // PART II. ENERGY DRINK CONSUMPTION
      double energyDrinks = ((double)18/100) * (15000);
      // Ansr: double oneOrMore = 15000 * .18;
      
      double citrusDrinks = ((double)58/100) * (2700);
      // Ansr: double preferCiturs = oneOrMore * .58;
      
      System.out.println("The approximate number of customers in the survey who purchase one or more enegry drinks per week: " + (energyDrinks));
      System.out.println("The approximate number of customers in the survey who prefer citrus-flavored energy drinks: " + (citrusDrinks));
      // Ansr: System.out.println(oneOrMore + " purchase one ore more.");
      // Ansr: System.out.println(preferCitrus + " prefer citrus.");
       
       
      // PART III. STAR PATTERN
	  
	  System.out.println("   *");
	  System.out.println("  ***");
	  System.out.println(" *****");
	  System.out.println("*******");
	  System.out.println(" *****");
	  System.out.println("  ***");
	  System.out.println("   *");
	  // 
				
   }
} 