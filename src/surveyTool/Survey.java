/**
 * Survey.java - Class for creating, editing, and controlling the filling out of a survey.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;

import java.util.ArrayList;

public class Survey {
	private String name = "";
	private String author = "";
	private ArrayList<Question> questions; // array list of the questions in the survey
	private boolean isAnonymous = true;

	// constructors
	public Survey(String name) {
		this.name = name;
	}

	public Survey(String name, String author, boolean isAnonymous) {
		this.name = name;
		this.author = author;
		this.isAnonymous = isAnonymous;
	}

	// returns an ArrayList of questions in the survey
	public ArrayList<Question> getQuestions() {
		return this.questions;
	}

	// adds a question to the survey
	public void addQuestion(Question question) {
		this.questions.add(question);
	}

	// removes the specified question from the survey
	public boolean removeQuestion(int questionId) {
		try {
			this.questions.remove(questionId);
			return true;
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}

	// returns the displayResults string instead of printing to console
	public String getResultsAsString() {
		String str = "";
		for(int i = 0; i < this.questions.size(); i++) {
			Question q = questions.get(i);
			str+= q.getText() + "\nResponses:\n";
			str+= q.getResponses().toString() + "\n";
		}
		return str;
	}

	// displays the results/data of the survey in the console
	public void displayResults() {
		String str = "";
		for(int i = 0; i < this.questions.size(); i++) {
			Question q = questions.get(i);
			str+= q.getText() + "\nResponses:\n";
			str+= q.getResponses().toString() + "\n";
		}
		System.out.println(str);
	}

	// takes in a question id, returns an ArrayList of the answers for that question
	public ArrayList<String> getResults(int questionId) {
		return this.questions.get(questionId).getResponses();
	}

	public String toString() {
		return "Survey [name=" + name + ", author=" + author + ", questions=" + questions + ", isAnonymous=" + isAnonymous + ", getQuestions()=" + getQuestions() + "]";
	}
}
