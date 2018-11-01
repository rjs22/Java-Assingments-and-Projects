// Ryan Sweitzer
// 12-3-15
// This program will read the contents of a file into an array
// and then sort the array numerically

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileToArraySort {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Declare File and Scanner objects
		File gradesFile = new File("grades.txt");
		Scanner fileScanner = new Scanner(gradesFile);
		
		// Determine how many grades are in file by looping though it
		int numGrades = 0;
		while(fileScanner.hasNextDouble())
		{
			fileScanner.nextDouble();
			numGrades++;
		}
		
		// Close scanner object
		fileScanner.close();
		
		// Declare array size
		double[] gradesArray = new double[numGrades];
		
		// Redeclare Scanner object
		fileScanner = new Scanner(gradesFile);
		
		// Loop through file and populate array
		int arrayCounter = 0;
		while(fileScanner.hasNextDouble())
		{
			gradesArray[arrayCounter] = fileScanner.nextDouble();
			arrayCounter++;
		}
		
		// Print out unsorted array
		for(double grade : gradesArray)
			System.out.print(grade + "\t");
		
		// Print out sorted array
		System.out.println();
		// arraySort(gradesArray);
		Arrays.sort(gradesArray);
		for(double grade : gradesArray)
			System.out.print(grade + "\t");
	}
	
	public static void arraySort(double[] array)
	{
		int startScan, index, minIndex;
		double minValue;
		
		for(startScan = 0; startScan < array.length - 1; startScan++)
		{
			minIndex = startScan;
			minValue = array[startScan];
			
			for(index = startScan + 1; index < array.length; index++)
			{
				if(array[index] < minValue)
				{
					minValue = array[index];
					minIndex = index;
				}
			}
			
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
	}

}
