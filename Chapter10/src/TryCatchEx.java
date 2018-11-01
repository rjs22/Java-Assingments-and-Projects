// Ryan Sweitzer
// 3-31-16
// this class will demonstrate the TryCatch

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		try{
			System.out.print("Enter a number: ");
			int num1 = keyboard.nextInt();
			System.out.print("Enter second number: ");
			int num2 = keyboard.nextInt();

			int result = num1/num2;
			System.out.println("The result is: " + result);
		}catch(ArithmeticException e){
			System.out.println("Hey - cannot devide by zero! Exiting!");
			System.exit(0);
		}catch(InputMismatchException e){
			System.out.println("You need to enter a number!");
		}
		System.out.println("Here!");
	}

}
