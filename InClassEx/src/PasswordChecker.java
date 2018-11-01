// Ryan Sweitzer
// 02-23-16
// Used to check passwords
public class PasswordChecker {

	public static void main(String[] args) {

		/*
		 * At least 14 Characers
		  * At least one character must be uppercase
		  * At least one character must be lowercase
		  * At least one number must be used
		  * At least one "other" (%&#@*) character or space must be used
		 */
		boolean foundUpper = false;
		boolean foundLower = false;
		boolean foundDigit = false;
		boolean foundSpecial = false;
		String password = "Test this password!1";
		if(password.length() >= 14){
			for(int i = 0; i < password.length(); i++){
				char letter = password.charAt(i);
				if(Character.isUpperCase(letter))
					foundUpper = true;
				if(Character.isLowerCase(letter))
					foundLower = true;
				if(Character.isDigit(letter))
					foundDigit = true;
				if(!Character.isLetterOrDigit(letter))
					foundSpecial = true;
			}
			if(foundUpper && foundLower && foundDigit && foundSpecial)
				System.out.println("yeah, good password!");
			else
				System.out.println("Sorry, does not meet minimum requirement");
		}
		else
			System.out.println("Sorry, password is too short");
	}

}
