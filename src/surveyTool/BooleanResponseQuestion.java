/**
 * BooleanResponseQuestion.java - Extends OptionResponseQuestion, making a true of false question easier to create.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;
import java.util.Arrays;

public class BooleanResponseQuestion extends OptionResponseQuestion implements Display {

	static ArrayList<String> options = new ArrayList<String>(Arrays.asList("true", "false")); // make an ArrayList of String containing "true" and "false"

	public BooleanResponseQuestion(String name, String questionText) {

		super(name, questionText, options);
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