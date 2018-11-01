// Ryan Sweitzer
// 2/2/16
// This program shows examples of the array list method

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList <String> simp = new ArrayList<String>();
		simp.add("Bart Simpson");
		simp.add("Lisa Simpson");
		simp.add("Homer Simpson");
		simp.add("Marge Simpson");
		simp.add("Montgomery Burns");
		// Change Lisa data
		simp.set(1, "Lisa Van Houten");
		// Remove Burns
		simp.remove(4);
		// also simp.remove("Burns")
		// add maggie
		simp.add("Maggie Simpson");
		
		System.out.println(simp);
		
		// ArrayList<IceCream> numbers = new ArrayList<IceCream>();
		// IceCream obj = new IceCream("Chocolate","Sprinkles")
		// IceCream.add(obj);

	}

}
