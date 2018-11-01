import javax.swing.JOptionPane;

// This short code snippet will be modified to show the differences between linear and bubble searches

public class SearchExample {

	//binary search
	/*
	 * 1. Let min = 0 and max = n-1.
	 * 2. Compute guess as the average of max and min, rounded down (so that it is an integer).
	 * 3. If array[guess] equals target, then stop. You found it! Return true.
	 * 4. If the guess was too low, that is, array[guess] < target, then set min = guess + 1.
	 * 5. Otherwise, the guess was too high. Set max = guess - 1.
	 * 6. Go back to step 2.
	 */
	public static boolean findItBinary(int searchItem, int[] list){
		int min = 0;
		int max = list.length - 1;
		int guess = 0;
		int i = 1;

		while(min <= max){
			System.out.println("Iteration: " + i++);
			guess = (max + min)/2;
			if(list[guess] == searchItem)
				return true;
			if(list[guess] < searchItem)
				min = guess + 1;
			else
				max = guess - 1;
		}
		return false;
	}

	//sequential search
	public static boolean findItSequentially(int searchItem, int[] list){
		for(int i = 0; i < list.length; i++){
			System.out.println("Iteration: "+ (i+1));
			if(list[i] == searchItem){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] numbers = {23, 25, 56, 78, 89, 103, 304, 345, 565, 876};
		int findThis = (Integer.parseInt(JOptionPane.showInputDialog("enter number")));
		if(findItBinary(findThis, numbers))
		{
			System.out.println("Found it!");
			System.out.println("Bianary" + Integer.toBinaryString(findThis));
			System.out.println("Octal" + Integer.toOctalString(findThis));
			System.out.println("Hex" + Integer.toHexString(findThis));
		}
		else
			System.out.println("Did not find it!");

	}

}