// Ryan Sweitzer
// 12-3-15
// This program will take in user information about a grocery list and print it out to a file

import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class Sweitzer_ProgrammingAssignment04 {

	public static void main(String[] args) throws IOException {
		
		// Create objects and variables
		DecimalFormat dec = new DecimalFormat("#.00");
		PrintWriter outputFile;
		Scanner keyboard = new Scanner(System.in);
		int counter = 1, groceryNum, itemQty;
		String groceryItem;
		double itemPrice = 0, priceSum = 0;
		
		// Ask user for name of file and create/open file
				System.out.print("What would you like to name the file: ");
				String fileName = keyboard.nextLine();
				
				// Check for period in fileName to see if there is an extension
				if(!fileName.contains("."))
					fileName += ".txt";
				
				// Check to see if file exists
				File newFile = new File(fileName);
				if(newFile.exists())
				{
					// Append to file
					FileWriter writer = new FileWriter(fileName, true);
				}else{
				
						outputFile = new PrintWriter(fileName);
					
						// Ask user for number of groceries and loop
						System.out.print("How many groceries do you have: ");
						groceryNum = keyboard.nextInt();
						keyboard.nextLine();
					
						outputFile.println("GROCERY LIST");
						outputFile.println("----------------------------------------");
					
						while(counter <= groceryNum)
						{
							System.out.print("What is item " + counter + ": ");
							groceryItem = keyboard.nextLine();
							outputFile.print(counter + ". " + groceryItem);
							System.out.print("What is the quantity of " + groceryItem + " you are planning on buying: " );
							itemQty = keyboard.nextInt();
							outputFile.print("\t " + itemQty);
							System.out.print("How much does " + groceryItem + " cost: ");
							itemPrice = keyboard.nextDouble();
							outputFile.println("\t $" + dec.format((itemPrice * itemQty)));
							keyboard.nextLine();
							priceSum = (priceSum + (itemPrice * itemQty));
							counter++;
						}		
							outputFile.println("----------------------------------------");
							outputFile.println("TOTAL (+tax)\t\t\t$" + dec.format(((priceSum * .06) + priceSum)));
					
							System.out.println("Data has been written to the file!");
					
							// Close file
							outputFile.close();
					}
		
		
		// Close Scanner
		keyboard.close();
	}

}
