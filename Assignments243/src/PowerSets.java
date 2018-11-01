// Ryan Sweitzer
// 2/19/17
// Program to show powersets of set entered

import java.util.Scanner;


public class PowerSets {

	static String[] set;

	public static void main(String[] args) {
		// objects
		PowerSets pwrSet = new PowerSets();
		Scanner keyboard = new Scanner(System.in);
		
		// asking for user input
		System.out.println("Input letters or numbers of a set you want to see a power set of.\nPlease separate input by commas or spaces.");
		
		// variables to take in user input and split
		String inChar = keyboard.nextLine();
		String[] outChar = inChar.split("[^a-zA-Z0-9]");
		set = new String[outChar.length];
		
		// sets the split into different
		for(int i = 0; i < outChar.length; i++)
			set[i] = outChar[i];
		
		// sets counter for the power set to be printed
		int[] setArray = new int[set.length];
		pwrSet.sets(setArray, 0);
		
		// closing scanner
		keyboard.close();

	}
	
	public void sets(int[] a, int x) {
		if (x == a.length - 1) {
			// last digit/character doesn't need to be selected
			a[x] = 0;
			// prints set
			printSet(a);
			// last digit/character needs to be selected
			a[x] = 1;
			printSet(a);
			return;
		}
		// digit/character not selected
		a[x] = 0;   
		sets(a, x + 1);
		// digit/character selected
		a[x] = 1;  
		sets(a, x + 1);
	}

	public void printSet(int[] a) {
		boolean isEmpty = true;
		System.out.print("{");
		for (int i = 0; i < set.length; i++) {
			if (a[i] == 1) {
				System.out.print(set[i] + "");
				isEmpty = false;
			}
		}
		if (isEmpty == false) {
			System.out.print("}");
			System.out.print("  ");
		}	

		if (isEmpty) {
			System.out.print("Empty");
			System.out.print("} ");
		}
	}

}
