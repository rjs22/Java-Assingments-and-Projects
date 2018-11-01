// Example using RandomFileAccess

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    public static void main(String[] args) {
    	final int RECORD_SIZE = 12; //hmmmmm.... what is the record size
        try {
            // Create a new instance of RandomAccessFile class. We'll do a "r"
            // read and "w" write operation to the file. If you want to do a write
            // operation you must also allow read operation to the RandomAccessFile
            // instance.
            RandomAccessFile raf = new RandomAccessFile("books.dat", "rw");  //hmmm... something might be wrong here

            // Let's write some book's title to the end of the file
            String books[] = new String[5];
            books[0] = "Pro. JSP  ";
            books[1] = "Interface ";
            books[2] = "J Security";
            books[3] = "JaHandbook";
            books[4] = "J2EE Basic";

            for (int i = 0; i < books.length; i++) {
                raf.writeUTF(books[i]);
            }

            // To do: Write different book at the end of the file (replace J2EE Basic)
            //
            raf.seek(RECORD_SIZE * 4);
            raf.writeUTF("Java Rulez"); //10 characters.
       
            // To do: Move the file pointer to the beginning of the file
            //
            raf.seek(0);
            
            // While the file pointer is less than the file length, read the
            // next strings of data file from the current position of the
            // file pointer
            while (raf.getFilePointer() < raf.length()) {
            	// To do: Read each string and print it out
            	//
            	System.out.println(raf.readUTF());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
