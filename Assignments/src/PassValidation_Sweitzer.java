// Ryan Sweitzer
// 2-5-16
// This program will validate a password that is written.
// The Password must be between 8 to 12 characters.
// Password must contain one lower case and one upper case character
// as well as a number.

import java.util.Scanner;

public class PassValidation_Sweitzer {

	public static void main(String[] args) {
		
		// Variables and objects
		int number = 0, lwrCase = 0, upprCase = 0, counter = 0;
		char character;
		Scanner keyboard = new Scanner(System.in);
		
		// Ask for password
		System.out.print("Your password must be between eight and twelve charaters long.\n" + 
						 "Your password must contain an uppercase, lowercase letter and at least one number\n" + 
						 "Please enter your password: ");
		String passWrd = keyboard.nextLine();
		
		// variable for length
		int length = passWrd.length();
		
		// if statements and loop to check string for correct characters
		if (length >= 8 && length <= 12)
		{
			while (counter < length)
			{
				character = passWrd.charAt(counter);
				
				if (Character.isLowerCase(character))
				{
					lwrCase = lwrCase + 1;
				}
				if (Character.isUpperCase(character))
				{
					upprCase = upprCase + 1;
				}
				if (Character.isDigit(character))
				{
					number = number + 1;
				}
					counter++;
			}
		}
		
		// if statement to check if input is correct
		if (number >= 1 && lwrCase >= 1 && upprCase >= 1)
			System.out.println("Password Verified!");
		else
			System.out.println("Password not accpeted!");
			
	}

}
