
public class ExtraCredit {

	public static void main(String[] args) {
		
		StringBuilder aStr = new StringBuilder("StopAndSmellTheRoses");
		
		// My submission
		//for(int i = 0; i < aStr.length(); i++){
			//char letter = aStr.charAt(i);
			//if(letter != 0 && Character.isUpperCase(letter)){
				//aStr.insert(i++," ");
			//}
			//System.out.println(aStr);
		//}
		for(int i = 0; i < aStr.length(); i++){
			if(Character.isUpperCase(aStr.charAt(i))){
			aStr.insert(i++, ' ');
			}
			System.out.println(i);
		}
		System.out.println("Answer: " + aStr);
	}

}
