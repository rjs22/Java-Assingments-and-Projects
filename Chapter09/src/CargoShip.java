/**
 * Chapter 9
 * Programming Challenge 10: Ship, CruiseShip, and CargoShip Classes
 * The CargoShip class stores information 
 * about a ship that carries weighted cargo.
 */

public class CargoShip extends Ship
{
   private int tonnage;    // Cargo tonnage

   /**
    * The constructor initializes the ship's name, 
    * year the ship was built, and the cargo tonnage.
    */

   CargoShip(String n, String y, int t)
   {
      // Call the superclass constructor (Ship),
      // passing the name and year as arguments.
      super(n, y);
      
      // Set tonnage.
      tonnage = t;
   }
   
   /**
    * The setTonnage method sets the maximum 
    * cargo tonnage.
    */
    
   public void setTonnage(int t)
   {
      tonnage = t;
   }
   
   /**
    * The getTonnage method returns the ship's 
    * cargo capacity in tons.
    */
    
   public int getTonnage()
   {
      return tonnage;
   }

   // Abstract method from ship class
   @Override
   public void steer()
   {
	System.out.println("Steady as she goes");   
   }
   
   /**
    * The toString method returns a string 
    * indicating the ship's name and the cargo 
    * capacity.
    */
   
   public String toString()
   {
      return "Name: " + super.toString() + "\nCargo capacity: " +
             tonnage + " tons" + "\nYear built: " + getYearBuilt();
   }
}