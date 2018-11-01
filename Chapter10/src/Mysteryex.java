
import java.io.*;

public class Mysteryex {

	public static void main(String[] args) throws IOException {

		DataInputStream theFile = new DataInputStream(new FileInputStream("mystery.dat"));
		boolean isTheEnd = false;
		while(!isTheEnd){
			try{
				System.out.println(theFile.readChar());
			}catch(EOFException e){
				isTheEnd = true;
			}
		}
		System.out.println();
		theFile.close();
	}

}
