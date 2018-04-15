/**
 * NumberResponseQuestion Class Description: 
 * --For a question that takes an integer as a response, 
 * --Implements Display interface, Inherits Question class
 * 
 * TODO cast to String because all other questions are String?
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;

import java.util.Arrays;
import java.util.Scanner;

public class IntResponseQuestion extends TextResponseQuestion implements Display {

	private int[] range = new int[2]; // range: Array of max number and minimum number acceptable

	/*
	 * IntResponseQuestion() Constructor Description:
	 * 
	 * --Parameters: String name(Name/Description of question), String qText(Actual
	 * question being asked) --Same as super in this case
	 */

	public IntResponseQuestion(String name, String qText) {
		super(name, qText);
	}

	/*
	 * IntResponseQuestion() Override Constructor Description:
	 * 
	 * --Parameters: String name(Name/Description of question), String qText(Actual
	 * question being asked), int[] range(Stores range of numbers accepted) --Adds
	 * int[] range variable
	 **/

	public IntResponseQuestion(String name, String qText, int[] range) {
		super(name, qText);
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

	public boolean isValidResponse(int resp) {
		if(resp >= range[0] && resp <= range[1]) {
			return true;
		}
		else {
			System.out.println("Your response is outside the valid range of " + this.range[0] + " to " + this.range[1]);
			return false;
		}
	}

	/*
	 * displayQuestion Method Description:
	 * 
	 * --Parameters: none --Returns: String --Required by implemented interface
	 * --Prints question to consoler, possibly JFrame if integrated into program
	 */
	public boolean displayQuestion() {
		Scanner kb = new Scanner(System.in);
		System.out.print(this.getText());
		int resp = kb.nextInt();
		return this.isValidResponse(resp);
	}
	
	public void displayResults() {
		super.displayResults();
	}
	
	public String toString() {
		return super.toString() + "IntResponseQuestion [range=" + Arrays.toString(range) + "]";
	}


}
