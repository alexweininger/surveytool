/**
 * ListResponseQuestion.java - Class for a question that implements a check-box system where multiple check-boxes are allowed to be checked.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;
import java.util.ArrayList;

public class ListResponseQuestion extends Question implements Display {

	private ArrayList<String> options; // list of options the user can select from
	private ArrayList<String> responses; // list of responses the user selects and submits
	private int responseLimit = -1; // the amount of options the user is allowed to submit

	// constructors
	public ListResponseQuestion(String name, String questionText) {
		super(name, questionText);
	}

	public ListResponseQuestion(String name, String questionText, int responseLimit) {
		super(name, questionText);
		this.responseLimit = responseLimit;
	}

	public ListResponseQuestion(String name, String questionText, int responseLimit, ArrayList<String> options) {
		super(name, questionText);
		this.responseLimit = responseLimit;
		this.options = options;
	}

	public void setOptions(ArrayList<String> options) { // set the list of options
		this.options = options;
	}

	public ArrayList<String> getOptions() { // get the list of options
		return this.options;
	}

	public void setResponses(ArrayList<String> responses) { // set the list of responses
		this.responses = responses;
	}

	public ArrayList<String> getResponses() { // get the list of responses
		return this.responses;
	}

	public void setResponseLimit(int limit) { // set the response limit
		this.responseLimit = limit;
	}

	public int getResponseLimit() { // get the response limit (int)
		return this.responseLimit;
	}

	public boolean isValidResponse(ArrayList<String> resp) { // check if the response if valid
		return true;
	}

	public String displayQuestion() { // display this question in JPanel
		return null;
	}

	public String toString() { // toString
		return null;
	}

}
