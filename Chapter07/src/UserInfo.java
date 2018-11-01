// Ryan Sweitzer
// 11-24-15
// This program will demonstrate how to split a string into am array

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		
		// Declare variables and objects
		String input;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your birthday (mm dd, yyyy): ");
		input = keyboard.nextLine();
		
		String[] birthdayArray = input.replace(",","").split(" ");
		
		System.out.println(birthdayArray[0]);
		System.out.println(birthdayArray[1]);
		System.out.println(birthdayArray[2]);
		
		// Close scanner
		keyboard.close();

	}

}
