/**
 * LongAnswerQuestion.java - class to represent a text response of practically unlimited length
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

public class TextResponseQuestion extends Question implements Display {

	private int charLimit = 2000; // character limit of the user input (default is 2000)

	public TextResponseQuestion(String name, String qText) {
		super(name, qText);
	}

	public TextResponseQuestion(String name, String questionText, int charLimit) {
		super(name, questionText);
		this.charLimit = charLimit;
	}
	
	public void setCharLimit(int charLimit) {
		this.charLimit = charLimit;
	}
	
	public int getCharLimit() {
		return this.charLimit;
	}

	public boolean isValidResponse(String resp) {
		return true;
	}

	public String displayQuestion() {
		return null;
	}

	public String toString() {
		return null;
	}
}
