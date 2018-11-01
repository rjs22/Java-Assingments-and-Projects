// Ryan Sweitzer
// 11-19-15
// This program will use loops to display different patterns

public class Sweitzer_ExtraCredit {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++)
			System.out.println("x");
		
		System.out.println("\n\n\nPyramid");
		for(int i = 0; i <= 5; i++)
		{
			for(int x = 0; x < i; x++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
//        x
//       xxx
//      xxxxx
//     xxxxxxx
//    xxxxxxxxx
// part2
//    xxxxxxxxx
//     xxxxxxx
//      xxxxx
//       xxx
//        x
		// Part 1
		System.out.println("\n\n\nReal Pyramid");
		for(int i = 1; i <= 5; i++)
		{
			for(int x = 5; x > i; x--)
			{
				System.out.print(" ");
			}
			for(int l = 2; l <=2*i; l++)
			{
				System.out.print("x");
			}
			System.out.println();
		
		}
		// Part 2
		System.out.println("\n\n\nSecond half of pyramid");
		for (int i = 6-1; i >= 1; i--)
		{
			for (int x = 1; x <= 5-i; x++)
			{
				System.out.print(" ");
			}
			for (int l = 1; l <=2*i-1; l++)
			{
				System.out.print("x");
			}
			System.out.println();
		
		
		}
		
		
	}

}
