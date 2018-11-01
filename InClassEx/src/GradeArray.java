// Ryan Sweitzer
// 2-9-2016
// This program will show grades organized in a two dimensional array

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeArray {

	public static void main(String[] args) {

		// Variables and objects
		int a = 0,b = 0,c = 0,f = 0;
		double studGrade;
		double totGrade = 0;
		DecimalFormat decFormat = new DecimalFormat("#0.00");
		Scanner keyboard = new Scanner(System.in);

		// Ask for how many grades
		System.out.println("Please enter the number of grades: ");
		int numOfGrades = keyboard.nextInt();

		// Create 2D array
		double[][] grades = new double[4][numOfGrades];

		// Gather grades for array
		for(int x = 0; x < numOfGrades; x++){
			System.out.print("Enter grade: ");
			studGrade = keyboard.nextDouble();
			if (studGrade >= 90){
				grades [0][a++] = a;
				totGrade += studGrade;
			}
			else if (studGrade >= 80){
				grades [1][b++] = b;
				totGrade += studGrade;
			}
			else if (studGrade >= 70){
				grades [2][c++] = c;
				totGrade += studGrade;
			}
			else{
				grades [3][f++] = f;
				totGrade += studGrade;
			}
		}

		// class average
		System.out.println("The grade average is: " + 
				decFormat.format(totGrade / numOfGrades) + "%\n");

		// Print out how many grades in a,b,c and f
		System.out.println("The number of grades are as follows: \n" + 
				"A: " + a + "\n" +
				"B: " + b + "\n" +
				"C: " + c + "\n" +
				"F: " + f + "\n");

		// histogram
		System.out.println("Histogram: ");
		String gradeLet[] = {"a", "b", "c", "f"};
		for(int g = 0; g < 4; g++){
			System.out.print(gradeLet[g] + " | ");
			for(int i = 0; i < grades[g][i] ; i++){
				if(a != 0)
					System.out.print("*");
				else if(b != 0)
					System.out.print("*");
				else if(c != 0)
					System.out.print("*");
				else if(f != 0)
					System.out.print("*");
			}
			System.out.println("");
		}
	}
}