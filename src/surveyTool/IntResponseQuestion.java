/**
 * IntResponseQuestion Class Description: 
 * --For a question that takes an integer as a response, 
 * --Implements Display interface, Inherits Question class
 * 
 * @author Alex Weininger and Niraj Mali
 * @version last updated 4/18/2018
 */

package surveyTool;

import java.util.Scanner;

public class IntResponseQuestion extends TextResponseQuestion implements Display {

	private int[] range = new int[2]; // range: Array of max number and minimum number acceptable

	/*
	 * IntResponseQuestion() Constructor Description:
	 * 
	 * --Parameters: String name(Name/Description of question), String qText(Actual
	 * question being asked) --Same as super in this case
	 */

	public IntResponseQuestion(String name, String questionText) {
		super(name, questionText);
	}

	/*
	 * IntResponseQuestion() Override Constructor Description:
	 * 
	 * --Parameters: String name(Name/Description of question), String qText(Actual
	 * question being asked), int[] range(Stores range of numbers accepted) --Adds
	 * int[] range variable
	 **/

	public IntResponseQuestion(String name, String questionText, int[] range) {
		super(name, questionText);
		this.range = range;
	}

	/*
	 * setRange Method Description:
	 * 
	 * --Parameters: int[] range(Stores range of numbers accepted) --Returns: void
	 * --Sets a new range for the question
	 */

	public void setRange(int[] range) {
		this.range = range;
	}

	/*
	 * getRange Method Description:
	 * 
	 * --Parameters: none --Returns: int[] --Grabs range
	 **/

	public int[] getRange() {
		return this.range;
	}

	/*
	 * isValidResponse Method Description:
	 * 
	 * --Parameters: int resp(Response from user, integer only) --Returns: boolean
	 * --Checks if user has given a valid response(in range, integer, etc.)
	 */

	public boolean isValidResponse(int response) {
		if (response >= range[0] && response <= range[1]) {
			this.addResponse("" + response);
			return true;
		} else {
			System.out.println("Your response is outside the valid range of " + this.range[0] + " to " + this.range[1]);
			return false;
		}
	}

	/*
	 * displayQuestion Method Description:
	 * 
	 * --Parameters: none --Returns: boolean --Required by implemented interface
	 * --Prints question to consoler
	 */
	public boolean displayQuestion() { // TODO
		boolean isInt = true;
		int response = 0;
		// moved out of the do and try blocks, move back into the try block if this
		// breaks
		do {
			try {
				Scanner kb = new Scanner(System.in);
				String str = this.getId() + ". " + this.getText() + "";
				str += "  (Please respond with an integer.)\n";
				System.out.println(str);
				isInt = true;
				response = kb.nextInt();
				System.out.println();
			} catch (Exception e) {
				System.out.println("Please enter an integer value only.");
				isInt = false;
			}
		} while (!(isInt)); 

		return this.isValidResponse(response);
	}

	public void displayResults() { // display the results in the console
		super.displayResults();
	}

	public String toString() { // IntResponse toString()
		String str = "";
		str += "| ------ IntResponse toString() -------\n";
		str += "| name: " + this.getName() + "\n";
		str += "| id: " + this.getId() + "\n";
		str += "| questionText: " + this.getText() + "\n";
		str += "| range: " + this.getRange() + "\n";
		str += "| responses: " + this.getResponses() + "\n";
		str += "| --------------------------------------\n";
		return str;
	}
}
