import java.util.*;

/**
 * The BuggyKeyboard class is a program which takes in a string input from the user, 
 * deletes the '<' character and the character before it, and outputs the new string.
 * 
 * This class contains one method and utilizes a StringBuilder.
 * 
 * @author Nicole Issagholian 
 *
 */

public class BuggyKeyboard {

	/**
	 * Removes all instances of '<' in the input string and the char before it
	 * 
	 * @param input is the string that the user inputs
	 * @return result that contains the final string after all instances of the '<' symbol and char before have been removed
	 */
	public static String finalString(String input) {
		StringBuilder result = new StringBuilder(); //use a StringBuilder to store the characters
		
		//Iterate through the input string, adding all the characters that are not '<' to the string
		for (int i=0; i<input.length(); ++i) { 
			if (input.charAt(i) != '<') {
				result.append(input.charAt(i)); 
			}
			else if (result.length() > 0) {
				result.deleteCharAt(result.length() - 1); //remove the last char in the result string if it's '<'
			}
		}
		
		//Return the result string as the final string
		return result.toString();
	}
	
	/**
	* The main() method of this program. 
	* 
	* @param a String array args
	*/
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in); //create scanner object
		
		String input = data.nextLine(); //read user input
		
		System.out.print(finalString(input)); //print final string
		
		data.close();

	}

}
