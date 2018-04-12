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

public class IntResponseQuestion extends Question implements Display {

	private int[] range = new int[2]; // range: Array list setting default acceptable range of numbers

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
		return true;
	}

	/*
	 * displayQuestion Method Description:
	 * 
	 * --Parameters: none --Returns: String --Required by implemented interface
	 * --Prints question to consoler, possibly JFrame if integrated into program
	 */
	public String displayQuestion() {
		return null;
	}

}
