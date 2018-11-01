//Purpose: This is a simple cafe program that we will convert to a 2d array. It also reviews some JOptionPane methods.
//Name: A. McNett
//Date: 2/1/2016

import javax.swing.JOptionPane;

public class Store {

	public static void main(String[] args) {
		int[][] orders = new int[20][3]; //max 20 orders
		String[] options = { "Decaf", "Cappuccino", "Latte", "Regular" };
		int col = 0, another, row = 0; 
		String orderSummary = "";
		
		// what type of method is being called below? ans: static
		JOptionPane.showMessageDialog(null, "Welcome to the cafe! Grab a cup of joe!");
		
		do{
			// take an order
			orders[row][col++] = JOptionPane.showOptionDialog(null, "Type", "Type", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
			orders[row][col++] = JOptionPane.showConfirmDialog(null, "Sugar?", "Sugar?", JOptionPane.YES_NO_OPTION);
			orders[row++][col++] = JOptionPane.showConfirmDialog(null, "Non-Dairy Creamer?", "Non-Dairy Creamer", JOptionPane.YES_NO_OPTION);
			another = JOptionPane.showConfirmDialog(null, "Another?", "Would you like another?", JOptionPane.YES_NO_OPTION);
			col=0; //reset to first column.
		}while(another != 1);
		
		// assemble order summary
		for(int j=0; j<row; j++)
			orderSummary += getOrder(orders[j][0], orders[j][1], orders[j][2]);
		
		JOptionPane.showMessageDialog(null, "OrderSummary: \n" + orderSummary);
	}
	
	public static String getOrder(int type, int sugar, int creamer){ //assembles order string
		String order = "";
		switch(type){
			case 0: order  += "Decaf "; break;
			case 1: order  += "Cappuccino "; break;
			case 2: order  += "Latte "; break;
			default: order  += "Regular ";
		}
		switch(sugar){
			case 0: order  += "Sugar "; break;
			default: order  += "No Sugar ";
		}
		switch(creamer){
			case 0: order  += "Creamer "; break;
			default: order  += "No Creamer ";
		}
		return order + "\n";
	}

}
