import java.io.*;

public class ReadCellPhones {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cellphoneobjects.dat"));
		
		CellPhone obj = (CellPhone) ois.readObject();
		
		obj.printPhone();

	}

}
