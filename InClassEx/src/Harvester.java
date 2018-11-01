import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Purpose: This program is an email harvester that will allow the user to supply a file name and parse the file for email addresses. The email addresses will be stored in an array.
 * Date: 1/11/16
 * @author Your name here
 */
public class Harvester {
	private String fileName;
	private String[] mailList;
	
	public Harvester(){ //default constructor
		fileName = "";
		mailList = new String[10];
	}
	public Harvester(String f) throws FileNotFoundException { //overloaded constructor
		mailList = new String[10];
		setFileName(f);
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) throws FileNotFoundException {
		this.fileName = fileName;
		File aFile = new File(fileName);
		if(!aFile.exists())
			System.out.println("File does not exist!");
		else{
			// parse for email addresses
			int i = 0;
			Scanner input = new Scanner(aFile);
			while(input.hasNextLine()){ // while there is something to read
				String line = input.nextLine();
				if(line.contains("@")){
					int atPosition = line.indexOf("@");
					int endPosition = line.indexOf(" ", atPosition);
					if(endPosition == -1)
						endPosition = line.length();
					int startPosition = line.lastIndexOf(" ", atPosition);
					String email = line.substring(startPosition + 1, endPosition);
					mailList[i] = email;
				}
				
			}
		}
	}
	public String[] getMailList() {
		return mailList;
	}
	@Override
	public String toString() { //returns string representation of object
		return "Harvester [fileName=" + fileName + ", addresses=" + Arrays.toString(mailList) + "]";
	}
	public int getNumOfEmails(){ //returns the number of items in the list... or does it?
		int count = 0;
		for(int i = 0; i < mailList.length; i++)
			if(mailList[i] != null)
				count++;
		
		return count;
	}
}
