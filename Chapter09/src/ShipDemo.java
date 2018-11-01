/**
 * Chapter 9
 * Programming Challenge 10: Ship, CruiseShip, and CargoShip Classes
 * This program demonstrates the Ship, CruiseShip, and CargoShip Classes.
 */

public class ShipDemo 
{
   public static void main(String[] args)
   {
      // Constant for the number of ships.
      final int NUM_SHIPS = 2;
      
      // Create an array of Ship references.
      Ship[] ships = new Ship[NUM_SHIPS];
      
      // Assign Ship objects to the array elements.
      ships[0] = new CruiseShip("Disney Magic", "1998", 2400);
      ships[1] = new CargoShip("Black Pearl", "1800", 50000);
      
      // Call each object's toString method.
      for (int index = 0; index < NUM_SHIPS; index++)
      {
    	 System.out.println(ships[index]);
    	 ships[index].steer(); 
         System.out.println("----------------------------");
      }
   }
}