/* Name: Your Name Here
 * Date: Current Date Here
 * Purpose: This simple GUI allows the user to enter an IP address.  
 * If it is a valid IP address, it will then return the class, whether it is private or not, and the 
 * binary equivalent.
 * This assignment has also been designed to give students an early glimpse of GUIs.
 * 
 * Note: Start by running the program to see what it does 
 */

//---------DO NOT MODIFY (really can if you want, but should not be needed to complete the assignment -------------------------------------
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddressInfoApp extends JFrame{
	private final int WINDOW_WIDTH = 300;	// Window width in pixels 
	private final int WINDOW_HEIGHT = 300; 	// Window height in pixels
	private Pattern p;						// For determining if the IP address is really an IP address
	private Matcher m;
	private char addressClass;				// Used to store what is returned by each method
	private boolean isAddressPrivate;
	private String addressBinary;
	
	private JLabel ipLabel;
	private JTextField ipTextField;
	private JButton submitButton;
	private JLabel infoLabel;
	private JLabel classLabel;
	private JTextField classTextField;
	private JLabel privateLabel;
	private JCheckBox privateCheckBox;
	private JLabel binaryLabel;
	private JTextField binaryTextField;
	
	// Do not change the following line
	private String ip;
	
	public AddressInfoApp(){
		super("IP Address Info");		// Sets title of the window
		
		setLayout(new GridLayout(6,2));	// Uses a grid layout, 6 rows with 2 columns
		
		// Setup pattern for valid IP Address
		p = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
		
		ipLabel = new JLabel("IP Address");
		ipTextField = new JTextField();
		submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {	// Is invoked when the user clicks the button to get the information
				ip = ipTextField.getText();
				m = p.matcher(ip);
				
				if(!m.find()){ 			// Not a valid IP address
					Frame frame = (JFrame) JFrame.getFrames()[0];
					JOptionPane.showMessageDialog(frame, "Not a valid IP Address -- Please enter a valid IP address.");	
				}
				else{					// Is a valid IP address
					ip = ipTextField.getText();
					addressClass = getAddressClass();
					isAddressPrivate = getPrivate();
					addressBinary = getBinary();
					
					classTextField.setText(""+addressClass);
					privateCheckBox.setSelected(isAddressPrivate);
					binaryTextField.setText(addressBinary);
				}
			}
			
		});
		
		infoLabel = new JLabel("Info");
		infoLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		classLabel = new JLabel("Class");
		classTextField = new JTextField();
		privateLabel = new JLabel("Private");
		privateCheckBox = new JCheckBox();
		binaryLabel = new JLabel("Binary");
		binaryTextField = new JTextField();
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 			// Sets the window size
		add(ipLabel);
		add(ipTextField);
		add(new JLabel(""));
		add(submitButton);
		add(infoLabel);
		add(new JLabel(""));
		add(classLabel);
		add(classTextField);
		add(privateLabel);
		add(privateCheckBox);
		add(binaryLabel);
		add(binaryTextField);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Specify what happens when the close button is clicked. 
		setVisible(true);								// Display the window
	}
	
	/* The following method is a setter that I used solely for writing my JUnit tests.	 */
	public void setIP(String ip){
		this.ip = ip;
	}
	//--------------------------END OF DO NOT MODIFY---------------------------------------

	/* Finish the code in this method. 
	 * This method determines the address class (see http://www.vlsm-calc.net/ipclasses.php)
	 * It then returns the appropriate letter (A - E) in uppercase.
	 */
	public char getAddressClass(){
		// To do: put your program logic here
		System.out.println("IP is: " + ip); 	// You can delete this -- just showing you that you have access to the IP address
		return 'X'; //should be in uppercase!
	}
	
	/* Finish the code in this method. 
	 * If the IP address is a private address, it should return true, otherwise it will return false.
	 */
	public boolean getPrivate(){
		// To do: put your program logic here
		System.out.println("IP is: " + ip); 	// You can delete this -- just showing you that you have access to the IP address
		return true;
	}
	
	/* Finish the code in this method. 
	 * This method takes the IP address and creates a binary equivalent of that IP address.
	 */
	public String getBinary(){
		// To do: put your program logic here
		System.out.println("IP is: " + ip); 	// You can delete this -- just showing you that you have access to the IP address
		return "00000000.00000000.00000000.00000000"; // Return address in this format, with all leading zeros (e.g. don't return 1 as "1" but "00000001")
	}
	
	// No need to modify this
	public static void main(String[] args){
		AddressInfoApp gui = new AddressInfoApp();
	}

}
