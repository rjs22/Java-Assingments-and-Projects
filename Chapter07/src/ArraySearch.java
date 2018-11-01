// Ryan Sweitzer
// 12/1/15
// This program will search an array for a certain value and return the subscript

public class ArraySearch {

	public static void main(String[] args) {
		
		// Array of test scores
		int[] testArray = {87, 95, 83, 100, 53};
		int result;
		
		result = testSearch(testArray, 100);
		
		if(result == -1)
			System.out.println("You did not earn a 100% on any test!");
		else
			System.out.println("You earned a 100% on test #" + (result + 1));
	}
	
	public static int testSearch(int[] array, int value)
	{
		int index     = 0,
			subscript = -1;
		boolean found = false;
		
		// Search array by looping
		while(!found && index < array.length)
		{
			if(array[index] == value)
			{
				subscript = index;
				found = true;
			}
			index++;
		}
		
		return subscript;
	}

}
