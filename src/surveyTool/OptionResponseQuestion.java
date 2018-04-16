/**
 * OptionResponseQuestion.java - Extends ListResponseQuestion, so that only 1 option may be selected and submitted.  (fill in the bubble)
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class OptionResponseQuestion extends Question implements Display {
	protected ArrayList<String> options; // list of options the user can select from
	// constructors
	public OptionResponseQuestion(String name, String questionText) {
		super(name, questionText); // set the response limit to 1 by default
	}

	public OptionResponseQuestion(String name, String questionText, ArrayList<String> options) {
		super(name, questionText);
		this.options = options; 
	}
	
	public void setOptions(ArrayList<String> options) { // set the list of options
		this.options = options;
	}

	public ArrayList<String> getOptions() { // get the list of options
		return this.options;
	}

	public boolean isValidResponse(String resp) { // is the user response valid, returns boolean
		return super.isValidResponse(resp);
	}

	public boolean displayQuestion() { // display the question in JPanel
		return super.displayQuestion();
	}

	public String toString() { // toString
		return super.toString();
	}

}
