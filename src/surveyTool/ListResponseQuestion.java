/**
 * ListResponseQuestion.java - Class for a question that implements a check-box system where multiple check-boxes are allowed to be checked.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;
import java.util.ArrayList;

public class ListResponseQuestion extends Question implements Display {

	private ArrayList<String> options;
	private ArrayList<String> responses;
	private int responseLimit = -1;
	
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
	
	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}
	
	public ArrayList<String> getOptions() {
		return this.options;
	}
	
	public void setResponses(ArrayList<String> responses) {
		this.responses = responses;
	}
	
	public ArrayList<String> getResponses() {
		return this.responses;
	}
	
	public void setResponseLimit(int limit) {
		this.responseLimit = limit;
	}
	
	public int getResponseLimit() {
		return this.responseLimit;
	}
	
	public boolean isValidResponse(ArrayList<String> resp) { // should we contain this in the Display interface?
		return true;
	}

	public String displayQuestion() {
		return null;
	}
	
	public String toString() {
		return null;
	}

}
