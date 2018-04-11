/**
 * Question.java - top level super class for all questions.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;

public class Question implements Display {
	private String name = "";
	private int id = -1; // based on number of questions already in survey
	private String questionText = "";
	private ArrayList<String> responses;

	public Question(String name) {
		this.name = name;
	}
	
	public Question(String name, String questionText) {
		this.name = name;
		this.questionText = questionText;
	}

	public void setName(String name) {
		// set the name
	}

	public String getName() {
		return null;
	}

	public int getId() {
		return this.id;
	}

	public void setText(String text) {
		// set text
	}

	public String getText() {
		return null;
	}

	public void addResponse(String response) {
		// add the String to the end of the responses list
	}

	public void setResponses(ArrayList<String> responses) {
		// stub
	}

	public ArrayList<String> getResponses() {
		return null;
	}

	public boolean isValidResponse(String response) {
		return true;
	}

	public String displayQuestion() {
		return null;
	}

	public String toString() {
		return null;
	}
}
