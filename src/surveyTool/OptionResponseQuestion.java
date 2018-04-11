/**
 * OptionResponseQuestion.java - Extends ListResponseQuestion, so that only 1 option may be selected and submitted.  (fill in the bubble)
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;

import java.util.ArrayList;

public class OptionResponseQuestion extends ListResponseQuestion implements Display {

	public OptionResponseQuestion(String name, String questionText) {
		super(name, questionText, 1);
	}

	public OptionResponseQuestion(String name, String questionText, ArrayList<String> options) {
		super(name, questionText, 1, options);
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
