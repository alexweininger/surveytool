/**
 * NumberRatingResponseQuestion.java - Extends OptionResponseQuestion, making a number rating question easier to create.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;

import java.util.ArrayList;

public class NumberRatingResponseQuestion extends OptionResponseQuestion implements Display {

	private int[] range = new int[2];

	public NumberRatingResponseQuestion(String name, String questionText, int responseLimit) {
		super(name, questionText);
	}

	public NumberRatingResponseQuestion(String name, String questionText, int responseLimit, int[] range) {
		super(name, questionText, initOptions(range));
		this.range = range;

	}

	public static ArrayList<String> initOptions(int[] range) { // this method is static because it needs to be invoked in the constructor
		ArrayList<String> options = new ArrayList<String>();
		for (int i = range[0]; i < range[1]; i++) {
			options.add("" + i);
		}
		return options;
	}

	public void setRange(int[] range) {
		this.range = range;
	}

	public int[] getRange() {
		return this.range;
	}

	public String displayQuestion() {
		return null;
	}

	public String toString() {
		return null;
	}
}
