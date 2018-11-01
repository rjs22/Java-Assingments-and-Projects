// Ryan Sweitzer
// 2/19/17
// Program to add, subtract and multiply matrices 
import java.util.Scanner;

public class Matrix {
	
	static int y,x,a,b;
	static String answer = "";
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and colums of the first matrix using a space to separate input");
		x = keyboard.nextInt();
		y  = keyboard.nextInt();
		
		System.out.println("Enter the number of rows and colums of the second matrix using a space to separate input");
		a = keyboard.nextInt();
		b  = keyboard.nextInt();

		int first[][] = new int[x][y];
		int second[][] = new int[a][b];
		int ans[][] = new int[x][y];
		
		System.out.println("Enter numbers into matrix as they would appear. Example for 2x2:\n 2 2\n 2 2\nExample for 3x2:\n 2 2 \n 2 2\n 2 2 \nExample for 2x3:\n 2 2 2 \n 2 2 2");
		System.out.println("Enter numbers of first matrix");

		for (int i = 0 ; i < x ; i++ )
			for (int j = 0 ; j < y ; j++ )
				first[i][j] = keyboard.nextInt();

		System.out.println("Enter numbers of second matrix");

		for (int i = 0 ; i < a ; i++ )
			for (int j = 0 ; j < b ; j++ )
				second[i][j] = keyboard.nextInt();

		System.out.println("Enter the desired operation");
		answer = keyboard.next();
		
		if(answer.equals("+")){
			if(x != a || y != b){
				throw new IllegalArgumentException("Rows and/or columbs do not match");
			}
			ans = matrixAdd(first,second);
		}
		else if(answer.equals("-")){
			if(x != a || y != b){
				throw new IllegalArgumentException("Rows and/or columbs do not match");
			}
			ans = matrixSub(first,second);
		}
		else
			ans = matrixMulti(first,second);
		
		
		System.out.println("answer to entered matrices: ");


		for (int i = 0 ; i < x ; i++ )
		{
			for (int j = 0 ; j < y ; j++ )
				System.out.print(ans[i][j]+"\t");

			System.out.println();
		}
		
		keyboard.close();

	}

	public static int[][] matrixAdd(int[][] a, int[][] b){
		int sum[][] = new int[x][y];
		for (int i = 0 ; i < x ; i++ )
			for (int j = 0 ; j < y ; j++ )
				sum[i][j] = a[i][j] + b[i][j];
		return sum;
	}
	
	public static int[][] matrixSub(int[][] a, int[][] b){
		int diff[][] = new int[x][y];
		for (int i = 0 ; i < x ; i++ )
			for (int j = 0 ; j < y ; j++ )
				diff[i][j] = a[i][j] - b[i][j];
		return diff;
	}
	
	public static int[][] matrixMulti(int[][] a, int[][] b){
		int aRow = a.length;
		int aColumn = a[0].length;
		int bRow = b.length;
		int bColumn = b[0].length;

		if (aColumn != bRow) {
			throw new IllegalArgumentException("A:Rows: " + aColumn + " did not match B:Columns " + bRow + ".");
		}

		int[][] prod = new int[aRow][bColumn];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				prod[i][j] = 0;
			}
		}
		for (int i = 0; i < aRow; i++) { // aRow
			for (int j = 0; j < bColumn; j++) { // bColumn
				for (int k = 0; k < aColumn; k++) { // aColumn
					prod[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return prod;
	}

}
