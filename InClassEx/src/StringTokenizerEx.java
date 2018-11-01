/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class StringTokenizerEx
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// The following string contains a list of sales over a 7 day period
		String sales = "1245.67,1490.07,1679.87,2378.46,1783.92,1468.99,2059.77";
		
		StringTokenizer st = new StringTokenizer(sales, ",");
		double total = 0;
		
	     while (st.hasMoreTokens()) {
	    	 total += Double.parseDouble(st.nextToken());
	     }
	     System.out.println("The total is: " + total);
		// Use the StrinkTokenizer class to get each token and add it to a total
		// Your delimiter will be a "," -- do not include the delimiter as a token
		
	}
}