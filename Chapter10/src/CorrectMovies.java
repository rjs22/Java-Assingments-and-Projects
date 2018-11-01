
import java.io.*;

public class CorrectMovies {

	public static void main(String[] args) throws IOException {
		final int TITLE = 22;
		final int RATING = 4;
		
		RandomAccessFile raf = new RandomAccessFile("Movies.dat", "rw");
		
		// used to seek the position of BatVsSup to change the rating
		raf.seek(22);
		raf.writeInt(99);
		
		// used to put the pointer back to beginning of file
		raf.seek(0);
		
		// used to change the force awakens rating
		raf.seek((TITLE + RATING)*5 + TITLE);
		//raf.seek(152);
		raf.writeInt(92);
		
		raf.seek(0);
		
		while(raf.getFilePointer() < raf.length()){
			System.out.print(raf.readUTF());
			System.out.println(raf.readInt());
		}

		raf.close();
	}

}
