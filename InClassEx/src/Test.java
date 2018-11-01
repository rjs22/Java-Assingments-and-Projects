//Purpose: Test class for Harvester code
//Date: 1/14/16
//Author: Alicia McNett

import java.io.FileNotFoundException;
import java.util.Arrays; // Ctrl + Shift + 0 (oh) for quick import of other classes/packages

public class Test {
	public static void main(String[] args) throws FileNotFoundException{
		String fileOne = "easy.txt";
		String fileTwo = "mid.html";
		String fileThree = "challenge.html";
		
		String[] emails = new String[100];
		
		//testing constructors
		Harvester obj1 = new Harvester();
		Harvester obj2 = new Harvester(fileTwo);
		Harvester obj3 = new Harvester(fileThree);
		
		//test file name getter
		if(!obj2.getFileName().equals(fileTwo))
			//Eclipse tip: type syserr and press Ctrl + Space to autocomplete error statement
			//Note: using "err" is not appropriate for production error message, just when doing development
			System.err.println("Problem with file name getter or constructor");
		
		//test file name setters
		obj1.setFileName(fileOne);
		if(!obj1.getFileName().equals(fileOne))
			System.err.println("Problem with file name setter");
		
		//test list size
		if(obj1.getNumOfEmails() != 3)
			System.err.println("Problem with getNumOfEmails and object 1");
		//test list size
		if(obj2.getNumOfEmails() != 1)
			System.err.println("Problem with getNumOfEmails and object 2");
		//test list size
		if(obj3.getNumOfEmails() != 3)
			System.err.println("Problem with getNumOfEmails and object 3");
				
		String[] fileOneList = new String[10];
		fileOneList[0]= "tellnoone@yahoo.com";
		fileOneList[1]= "didyoutellnoone@gmail.com";
		fileOneList[2]= "yesthereis@pct.edu";
		
		//test list returned 
		if(!Arrays.equals(obj1.getMailList(), fileOneList))
				System.err.println("Error getting email list for obj 1");
		
		String[] fileTwoList = new String[10];
		fileTwoList[0]= "amcnett@pct.edu";
		
		//test list returned 
		if(!Arrays.equals(obj2.getMailList(), fileTwoList))
				System.err.println("Error getting email list for obj 2");
		
		//test list returned
		String[] fileThreeList = new String[10];
		fileThreeList[0]= "ST-VOTERREG@pa.gov";
		fileThreeList[1]= "ST-HAVA@pa.gov";
		fileThreeList[2]= "ST-HAVA@pa.gov";
		
		//test list returned 
		if(!Arrays.equals(obj3.getMailList(), fileThreeList))
				System.err.println("Error getting email list for obj 3");
		
		//test toString
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
	
		//Eclipse tip: type sysout and press Ctrl + Space to autocomplete print statement
		System.out.println("Test of Harvester class complete");
	}
}
