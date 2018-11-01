// Ryan Sweitzer
// 12-1-15
// This program will search a file and match a zip code and return the users city/state

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Sweitzer_ProgrammingAssignment05 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// check for if user inputs a 0.
		// City needs to be properly cased
		// print to file called address.txt
		
		// Create File object
		PrintWriter outputFile = new PrintWriter("Address.txt");
		File zipsFile = new File("zips.csv");
		Scanner inputFile = new Scanner(zipsFile);
		Scanner keyboard = new Scanner(System.in);
		String fullName, streetAddress, zipCode = "";
		StringBuilder titleCase = new StringBuilder();
		
		// Ask user for name and street address
		System.out.print("What is your full name?");
		fullName = keyboard.nextLine();
		outputFile.println(fullName);
		System.out.println("What is your street address?");
		streetAddress = keyboard.nextLine();
		outputFile.println(streetAddress);
		System.out.println("What is your zip code?");
		zipCode = keyboard.nextLine();
		
		// Loop through file
		while(inputFile.hasNextLine())
		{
			String lineFromFile = inputFile.nextLine();
		if (zipCode.substring(0, 1) == "0")
		{
			zipCode.substring(1);
		}else
			if(lineFromFile.contains(zipCode))
			{			
				String[] arrage = lineFromFile.split(",");
				String part1 = arrage[0];
				String part2 = arrage[1];
				String part3 = arrage[2];
				part3 = part3.substring(0, 1).toUpperCase() + part3.substring(1).toLowerCase(); 
				outputFile.println(part3 + ", " + part2 + " " + part1);
			}
		
		}
		
		
		// Close objects
		inputFile.close();
		keyboard.close();
		outputFile.close();
	}

}
