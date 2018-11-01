import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class pizza {

	private JFrame frame;
	private JTextField txtTotal;
	private JRadioButton smlButton;
	private JRadioButton mdButton;
	private JRadioButton lgButton;
	private JList topList;
	private JComboBox comboBox;
	private JLabel lblTitle;
	private JCheckBox dlvCheckBox;
	private JLabel lblTotal;
	private int orderTotal;
	private JList<String> addList;
	private JButton btnOrderUp;
	private JLabel lblListSelection;
	private JLabel lblCustomerSelction;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizza window = new pizza();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pizza() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 552, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		smlButton = new JRadioButton("Small $10");
		smlButton.setHorizontalAlignment(SwingConstants.CENTER);
		smlButton.setBounds(46, 57, 109, 23);
		frame.getContentPane().add(smlButton);

		mdButton = new JRadioButton("Medium $15");
		mdButton.setHorizontalAlignment(SwingConstants.CENTER);
		mdButton.setBounds(46, 83, 109, 23);
		frame.getContentPane().add(mdButton);

		lgButton = new JRadioButton(" Large $20");
		lgButton.setHorizontalAlignment(SwingConstants.CENTER);
		lgButton.setBounds(46, 109, 109, 23);
		frame.getContentPane().add(lgButton);

		ButtonGroup group = new ButtonGroup();
		group.add(smlButton);
		group.add(mdButton);
		group.add(lgButton);



		topList = new JList();
		topList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Pepperoni", "Peppers", "mushrooms", "sausage", "bacon"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});



		topList.setBounds(266, 76, 97, 91);
		frame.getContentPane().add(topList);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"$0 -- Thin", "$2 -- Medium", "$4 -- Pan"}));
		comboBox.setBounds(41, 158, 134, 29);
		frame.getContentPane().add(comboBox);

		lblTitle = new JLabel("Ryan's Pizzas");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(6, 11, 418, 29);
		frame.getContentPane().add(lblTitle);

		dlvCheckBox = new JCheckBox("Delivery? $5");
		dlvCheckBox.setSelected(true);
		dlvCheckBox.setBounds(329, 231, 97, 23);
		frame.getContentPane().add(dlvCheckBox);

		// JtestField object
		txtTotal = new JTextField();

		// Running Total
		txtTotal.setText("" + orderTotal);
		txtTotal.setBounds(266, 282, 197, 38);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);

		// Label with total
		lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(22, 280, 197, 42);
		frame.getContentPane().add(lblTotal);
		
		
		// used for adding toping to a list
		addList = new JList<String>(new DefaultListModel<String>());
		addList.setBounds(411, 76, 89, 97);
		frame.getContentPane().add(addList);
		
		// JList for toping selection
		lblListSelection = new JLabel("Topping Selection");
		lblListSelection.setHorizontalAlignment(SwingConstants.CENTER);
		lblListSelection.setBounds(266, 61, 97, 14);
		frame.getContentPane().add(lblListSelection);
		
		// JList for customer toping selection
		lblCustomerSelction = new JLabel("Customer Selction");
		lblCustomerSelction.setBounds(411, 61, 89, 14);
		frame.getContentPane().add(lblCustomerSelction);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(255, 200, 0), new Color(64, 64, 64)));
		panel.setBounds(41, 51, 122, 91);
		frame.getContentPane().add(panel);

		// Objects for handlers
		CheckHandler chkHandler = new CheckHandler();
		ButtonHandler btnHandler = new ButtonHandler();
		ToppingSelectionHandler topSelectHandler = new ToppingSelectionHandler();

		// Action listeners for buttons and radio
		smlButton.addActionListener(btnHandler);
		mdButton.addActionListener(btnHandler);
		lgButton.addActionListener(btnHandler);
		comboBox.addActionListener(btnHandler);

		// List selection listener for Jlist
		topList.addListSelectionListener(topSelectHandler);

		// listener for JCheckBox
		dlvCheckBox.addItemListener(chkHandler);
	}

	private class CheckHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (!dlvCheckBox.isSelected())
				orderTotal -= 5;
			txtTotal.setText("$" + orderTotal);
		}

	}

	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (smlButton.isSelected())
				orderTotal = 10;
			else if (mdButton.isSelected())
				orderTotal = 15;
			else if (lgButton.isSelected())
				orderTotal = 20;

			String comboSelect = (String) comboBox.getSelectedItem();
			
		
			if (comboSelect.equals("$2 -- Medium"))
				orderTotal += 2;
			else if (comboSelect.equals("$4 -- Pan"))
				orderTotal += 4;
			txtTotal.setText("$" + orderTotal);
			
			
		}

	}

	private class ToppingSelectionHandler implements ListSelectionListener{
		@Override
		public void valueChanged(ListSelectionEvent e) {
			
			while (e.getValueIsAdjusting()){
				((DefaultListModel)addList.getModel()).addElement(topList.getSelectedValue());
				orderTotal = orderTotal + 2;
				break;
			}
			
			txtTotal.setText("" + orderTotal);
			
		}

	}
}
