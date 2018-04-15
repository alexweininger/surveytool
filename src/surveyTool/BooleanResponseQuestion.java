/**
 * BooleanResponseQuestion.java 
 * --Extends OptionResponseQuestion, making a true of false question easier to create.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;
import java.util.Arrays;

public class BooleanResponseQuestion extends OptionResponseQuestion implements Display {

	// make an ArrayList of String containing "true" and "false"
	static ArrayList<String> options = new ArrayList<String>(Arrays.asList("true", "false"));

	// constructor
	public BooleanResponseQuestion(String name, String questionText) {

		super(name, questionText, options);
	}

	public boolean isValidResponse(String resp) { // check if the user response if valid
		if (resp.equalsIgnoreCase("0") || resp.equalsIgnoreCase("1")) {
			String response = (resp.equalsIgnoreCase("0")) ? "true" : "false";
			this.addResponse(response);
			return true;
		} else {
			return false;
		}
	}

	public boolean displayQuestion() { // display the question in console
		return super.displayQuestion();	
	}
	
	public void displayResults() { 
		for(int i = 0; i < getResponses().size(); i++) {
			System.out.println(this.getResponses().get(i));
		}
	}

	public String toString() {
		return super.toString() + "BooleanResponseQuestion []";
	}

}
