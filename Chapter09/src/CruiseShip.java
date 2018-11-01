/**
 * Chapter 9
 * Programming Challenge 10: Ship, CruiseShip, and CargoShip Classes
 * The CruiseShip class stores information 
 * about a ship that carries passengers.
 */

public class CruiseShip extends Ship
{
   private int passengers;    // Maximum number of passengers

   /**
    * The constructor initializes the ship's name, 
    * year the ship was built, and the maximum 
    * number of passengers.
    */

   CruiseShip(String n, String y, int p)
   {
      // Call the superclass constructor (Ship),
      // passing the name and year as arguments.
      super(n, y);
      
      // Set passengers.
      passengers = p;
   }
   
   /**
    * The setPassengers method sets the 
    * maximum number of passengers.
    */
    
   public void setPassengers(int p)
   {
      passengers = p;
   }
   
   /**
    * The getPassengers method returns the 
    * ship's maximum number of passengers.
    */
    
   public int getPassengers()
   {
      return passengers;
   }
   
   // abstract method from ship class
   @Override
   public void steer()
   {
	System.out.println("Steady on course");   
   }
   
   /**
    * The toString method returns a string 
    * indicating the ship's name and the 
    * maximum number of passengers.
    */
   
   public String toString()
   {
      return "Name: " + super.toString() + "\nMaximum passengers: " +
             passengers + "\nYear built: " + getYearBuilt();
   }
}