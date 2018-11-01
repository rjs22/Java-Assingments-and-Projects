import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class GuiEx {

	public static void main(String[] args) {
		
		/*JFrame win = new JFrame("Welcome World");
		win.setSize(400,300);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);*/
		
		MyWindow obj = new MyWindow();
	}

}

class MyWindow extends JFrame{
	
	private JLabel inputLbl;
	private JTextField inputTxt;
	private JButton inputBtn;
	private JCheckBox inputChk;
	
	public MyWindow(){
		setSize(400, 300);
		this.setTitle("Hello World");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//initializing
		inputLbl = new JLabel("Enter name");
		inputTxt = new JTextField(10);
		inputBtn = new JButton("Enter");
		inputChk = new JCheckBox("Newsletter?", true);
		
		inputBtn.setBackground(Color.DARK_GRAY);
		inputBtn.setForeground(Color.CYAN);
		
		ButtonHandler btnHandler = new ButtonHandler();
		inputBtn.addActionListener(btnHandler);
		inputTxt.addActionListener(btnHandler);
		
		// for check box
		CheckListener chkHandler = new CheckListener();
		inputChk.addItemListener(chkHandler);
		
		setLayout(new GridLayout(0,3));
		//JPanel inputPnl = new JPanel();
		add(inputLbl/*, BorderLayout.NORTH*/);
		add(inputTxt/*, BorderLayout.CENTER*/);
		add(new JPanel());
		add(inputBtn/*, BorderLayout.SOUTH*/);
		add(new JLabel("test"));
		add(inputChk);
		JPanel pnl = new JPanel();
		pnl.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.black));
		
		//this.add(inputPnl);
		
		this.setVisible(true);
	}
	
	// event handler class for check box
	private class CheckListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			System.out.print("clicked");
			
		}
		
	}
	
	// event handler class
	private class ButtonHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, inputTxt.getText());
			
		}
		
	}// end of inner class
	
}