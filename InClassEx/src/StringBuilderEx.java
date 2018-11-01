// Ryan Sweitzer
// 3/1/16
// This is to practice using the string builder method

public class StringBuilderEx {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Today is Tuesday");
		
		System.out.println("len is: " + str.length() + " Cap is: " + str.capacity());
		
		str.append(", February 23ed");
		
		str.replace(0, 5, "Tomorrow");
		
		str.replace(12, 19, "Wednesday");
		
		str.delete(21, 36);
		// or str.delete(21, str.length());
		
		System.out.println("len is: " + str.length() + " Cap is: " + str.capacity());
		
		str.trimToSize();
		
		System.out.println("len is: " + str.length() + " Cap is: " + str.capacity());
		
		System.out.println(str);
		
		

	}

}
