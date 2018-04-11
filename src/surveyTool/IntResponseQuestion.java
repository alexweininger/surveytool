/**
 * NumberResponseQuestion.java - class for a question that takes an integer as a response, TODO cast to String because all other questions are String?
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;

public class IntResponseQuestion extends Question implements Display {

	private int[] range = new int[2];

	public IntResponseQuestion(String name, String qText) {
		super(name, qText);
	}

	public IntResponseQuestion(String name, String qText, int[] range) {
		super(name, qText);
		this.range = range;
	}

	public void setRange(int[] range) {
		this.range = range;
	}

	public int[] getRange() {
		return this.range;
	}

	public boolean isValidResponse(int resp) {
		return true;
	}

	public String displayQuestion() {
		return null;
	}

}
