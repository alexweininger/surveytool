/**
 * TextResponseQuestion.java - class to represent a text response of practically unlimited length
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/17/2018
 */

package surveyTool;

public class TextResponseQuestion extends Question implements Display {

	private int charLimit = 2000; // character limit of the user input (default is 2000)

	// constructors
	public TextResponseQuestion(String name, String questionText) {
		super(name, questionText);
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

	public boolean isValidResponse(String response) { // check if the response is valid, e.g. if it is under the character limit
		if (response.length() > charLimit) {
			return false;
		}
		this.addResponse(response);
		return true;
	}

	public boolean displayQuestion() { // display the question in the console
		return super.displayQuestion();
	}

	public void displayResults() { // display the results in the console
		super.displayResults();
	}

	public String toString() { // TextResponse toString()
		String str = "";
		str += "| ------ TextResponse toString() -------\n";
		str += "| name: " + this.getName() + "\n";
		str += "| id: " + this.getId() + "\n";
		str += "| questionText: " + this.getText() + "\n";
		str += "| responses: " + this.getResponses() + "\n";
		str += "| ----------------------------------------\n";
		return str;
	}
}