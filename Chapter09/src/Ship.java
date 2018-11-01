/**
 * Chapter 9
 * Programming Challenge 10: Ship, CruiseShip, and CargoShip Classes
 * The Ship class stores information about a ship.
 */

public abstract class Ship
{
   private String name;         // Ship name
   private String yearBuilt;    // Year it was built
   
   /**
    * The constructor initializes the ship's 
    * name and the year the ship was build.
    */
    
   public Ship(String n, String y)
   {
      name = n;
      yearBuilt = y;
   }
   
   /**
    * The setName method sets the ship's name.
    */
    
   public void setName(String n)
   {
      name = n;
   }

   /**
    * The setYearBuilt method sets the year 
    * the ship was built.
    */
    
   public void setYearBuilt(String y)
   {
      yearBuilt = y;
   }


   /**
    * The getName method returns the ship's name.
    */
    
   public String getName()
   {
      return name;
   }

   /**
    * The getYearBuilt method returns the 
    * year the ship was built.
    */
    
   public String getYearBuilt()
   { 
      return yearBuilt;
   }
   
   /**
    * The toString method returns a string 
    * indicating the ship's name and the 
    * year it was built.
    */
    
   public String toString()
   {
      return "Name: " + name + "\nYear built: " +
             yearBuilt;
   }
   
   public abstract void steer();
}