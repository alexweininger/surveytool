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
		if (resp.equalsIgnoreCase("1") || resp.equalsIgnoreCase("2")) {
			System.out.println(resp);
			String response = (resp.equalsIgnoreCase("1")) ? "true" : "false";
			super.addResponse(response);
			System.out.println(response);
			return true;
		} else {
			return false;
		}
	}

	public boolean displayQuestion() { // display the question in console
		return super.displayQuestion();	
	}
	
	public void displayResults() {
		System.out.println("Results for boolean question: " + this.getText());
		System.out.println(super.getResponses());
		for(int i = 0; i < super.getResponses().size(); i++) {
			System.out.println(super.getResponses().get(i));
		}
	}

	public String toString() {
		return super.toString() + "BooleanResponseQuestion []";
	}

}
