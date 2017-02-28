import javax.swing.JOptionPane;

/**
 * 
 * @author Ricardo Guerra
 * 
 * This program uses mono-alphabetic substitution to encrypt Strings
 * and reverses the process to decrypt Strings. Initially, the user
 * is prompted to decide whether to encrypt or decrypt a message by
 * entering a value of 1 (to encrypt) or a value of 2 (to decrypt).
 * All other inputs are invalid and will cause the program to respond
 * with a message stating that the input value is invalid and end the
 * program. After deciding whether to encrypt or decrypt a message,
 * the user will be prompted to enter a message. The message will then
 * be either encrypted or decrypted and the result will display in a
 * message dialog.
 */

public class Secret_Message {
	
	public static void main(String[] args) {
		
		String Option = JOptionPane.showInputDialog(null, "Would you like to encrypt or decrypt a "
				+ "message?\n\nType '1' to encrypt.\nType '2' to decrypt.");
		// Option: user input, must be '1' or '2'. Otherwise, exception and the program ends
		
		if(Option.equals("1")){
			
			String Message = JOptionPane.showInputDialog(null, "Type the message to be encrypted.");
			// Message: user input.
			
			String Result = Encryption(Message);
			// Encrypts the message
			
			JOptionPane.showMessageDialog(null, "Encryption complete. Here's your new message:\n\n"
					+ Result);
			// Returns the result in a JOptionPane - show message dialog
		}
		else{
			if(Option.equals("2")){
				
				String Message = JOptionPane.showInputDialog(null, "Type the message to be decrypted.");
				// Message: user input.
				
				String Result = Decryption(Message);
				// Decrypts the message
				
				JOptionPane.showMessageDialog(null, "Here is your secret message:\n\n" + Result);
				// Returns the result in a JOptionPane - show message dialog
			}
			else{				
				JOptionPane.showMessageDialog(null, "Invalid Input!");
				// Exception handling: The program ends
			}
		}
	} // main
	
	/**
	 * Uses mono-alphabetic substitution to encrypt Strings.
	 * 
	 * @param Msg - The message that is to be encrypted.
	 * 
	 * @return - Returns a String containing the encrypted message.
	 */
	
	public static String Encryption(String Msg){
		
		String Translation = " ";
		
		for(int a = 0; a < Msg.length(); a++){
			if(Msg.charAt(a) == 'a' || Msg.charAt(a) == 'A') Translation += 'q';
			else if(Msg.charAt(a) == 'b' || Msg.charAt(a) == 'B') Translation += 'w';
			else if(Msg.charAt(a) == 'c' || Msg.charAt(a) == 'C') Translation += 'e';
			else if(Msg.charAt(a) == 'd' || Msg.charAt(a) == 'D') Translation += 'r';
			else if(Msg.charAt(a) == 'e' || Msg.charAt(a) == 'E') Translation += 't';
			else if(Msg.charAt(a) == 'f' || Msg.charAt(a) == 'F') Translation += 'y';
			else if(Msg.charAt(a) == 'g' || Msg.charAt(a) == 'G') Translation += 'u';
			else if(Msg.charAt(a) == 'h' || Msg.charAt(a) == 'H') Translation += 'i';
			else if(Msg.charAt(a) == 'i' || Msg.charAt(a) == 'I') Translation += 'o';
			else if(Msg.charAt(a) == 'j' || Msg.charAt(a) == 'J') Translation += 'p';
			else if(Msg.charAt(a) == 'k' || Msg.charAt(a) == 'K') Translation += 'a';
			else if(Msg.charAt(a) == 'l' || Msg.charAt(a) == 'L') Translation += 's';
			else if(Msg.charAt(a) == 'm' || Msg.charAt(a) == 'M') Translation += 'd';
			else if(Msg.charAt(a) == 'n' || Msg.charAt(a) == 'N') Translation += 'f';
			else if(Msg.charAt(a) == 'o' || Msg.charAt(a) == 'O') Translation += 'g';
			else if(Msg.charAt(a) == 'p' || Msg.charAt(a) == 'P') Translation += 'h';
			else if(Msg.charAt(a) == 'q' || Msg.charAt(a) == 'Q') Translation += 'j';
			else if(Msg.charAt(a) == 'r' || Msg.charAt(a) == 'R') Translation += 'k';
			else if(Msg.charAt(a) == 's' || Msg.charAt(a) == 'S') Translation += 'l';
			else if(Msg.charAt(a) == 't' || Msg.charAt(a) == 'T') Translation += 'z';
			else if(Msg.charAt(a) == 'u' || Msg.charAt(a) == 'U') Translation += 'x';
			else if(Msg.charAt(a) == 'v' || Msg.charAt(a) == 'V') Translation += 'c';
			else if(Msg.charAt(a) == 'w' || Msg.charAt(a) == 'W') Translation += 'v';
			else if(Msg.charAt(a) == 'x' || Msg.charAt(a) == 'X') Translation += 'b';
			else if(Msg.charAt(a) == 'y' || Msg.charAt(a) == 'Y') Translation += 'n';
			else if(Msg.charAt(a) == 'z' || Msg.charAt(a) == 'Z') Translation += 'm';
			
			else if(Msg.charAt(a) == '.'){
				Translation += Msg.charAt(a);
				Translation += "\n";
			}
			else Translation += Msg.charAt(a);
		}
		
		return Translation;
	} // Encryption
	
	/**
	 * Decrypts an input String.
	 * 
	 * @param Msg - The message that is to be decrypted.
	 * 
	 * @return - Returns a String containing the decrypted message.
	 */
	
	public static String Decryption(String Msg){
		
		Msg = Msg.toLowerCase();
		String Translation = " ";
		
		for(int a = 0; a < Msg.length(); a++){
			if(Msg.charAt(a) == 'q') Translation += 'a';
			else if(Msg.charAt(a) == 'w') Translation += 'b';
			else if(Msg.charAt(a) == 'e') Translation += 'c';
			else if(Msg.charAt(a) == 'r') Translation += 'd';
			else if(Msg.charAt(a) == 't') Translation += 'e';
			else if(Msg.charAt(a) == 'y') Translation += 'f';
			else if(Msg.charAt(a) == 'u') Translation += 'g';
			else if(Msg.charAt(a) == 'i') Translation += 'h';
			else if(Msg.charAt(a) == 'o') Translation += 'i';
			else if(Msg.charAt(a) == 'p') Translation += 'j';
			else if(Msg.charAt(a) == 'a') Translation += 'k';
			else if(Msg.charAt(a) == 's') Translation += 'l';
			else if(Msg.charAt(a) == 'd') Translation += 'm';
			else if(Msg.charAt(a) == 'f') Translation += 'n';
			else if(Msg.charAt(a) == 'g') Translation += 'o';
			else if(Msg.charAt(a) == 'h') Translation += 'p';
			else if(Msg.charAt(a) == 'j') Translation += 'q';
			else if(Msg.charAt(a) == 'k') Translation += 'r';
			else if(Msg.charAt(a) == 'l') Translation += 's';
			else if(Msg.charAt(a) == 'z') Translation += 't';
			else if(Msg.charAt(a) == 'x') Translation += 'u';
			else if(Msg.charAt(a) == 'c') Translation += 'v';
			else if(Msg.charAt(a) == 'v') Translation += 'w';
			else if(Msg.charAt(a) == 'b') Translation += 'x';
			else if(Msg.charAt(a) == 'n') Translation += 'y';
			else if(Msg.charAt(a) == 'm') Translation += 'z';
			
			else if(Msg.charAt(a) == '.'){
				Translation += Msg.charAt(a);
				Translation += "\n";
			}
			else Translation += Msg.charAt(a);
		}
		
		return Translation;
	} // Decryption

} // Secret_Message