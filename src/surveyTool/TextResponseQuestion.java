/**
 * LongAnswerQuestion.java - class to represent a text response of practically unlimited length
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;

public class TextResponseQuestion extends Question implements Display {

	private int charLimit = 2000; // character limit of the user input (default is 2000)

	// constructors
	public TextResponseQuestion(String name, String qText) {
		super(name, qText);
	}

	// Overloaded constructor: adds limit to characters typed in text
	public TextResponseQuestion(String name, String questionText, int charLimit) {
		super(name, questionText);
		this.charLimit = charLimit;
	}

	public void setCharLimit(int charLimit) { // set the character limit of the response
		this.charLimit = charLimit;
	}

	public int getCharLimit() { // get the character limit
		return this.charLimit;
	}

	public boolean isValidResponse(String resp) { // check if the response is valid, e.g. if it is under the character limit
		return true;
	}

	public String displayQuestion() { // display the question with JPanel
		return null;
	}

	public String toString() { // toString
		return null;
	}
}
