/**
 * Question.java - top level super class for all questions.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;

public class Question {
	private String name = "";
	private int id = -1; // based on number of questions already in survey
	private String questionText = "";
	private ArrayList<String> responses;

	public Question(String name, String qText) {
		// stub
	}

	public String getText() {
		return null;
	}

	public String getName() {
		return null;
	}

	public int getId() {
		return this.id;
	}

	public void setText(String text) {
		// stub
	}

	public void setName(String name) {
		// stub
	}

	public void setAnswer(String answer) {
		// stub
	}

	public String getAnswer() {
		return null;
	}
}
