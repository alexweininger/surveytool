/**
 * Survey.java - Class defines what a survey must hold and manage.  This class is for creating and altering surveys.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Survey {
	private String name = "";
	private String author = "";
	private ArrayList<Question> questions;
	private boolean isComplete = false;
	private boolean isAnonymous = true;

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
		return null;
	}

	// adds a question to the survey
	public void addQuestion(Question question) {

	}

	// removes the specified question from the survey
	public boolean removeQuestion(int questionId) {
		return false;
	}

	// displays the results/data of the survey in
	public String displayResults() {
		return null;
	}

	// takes in a question id, returns an ArrayList of the answers for that question
	public ArrayList<Question> getAnswers(int questionId) {
		return null;
	}

	public String toString() {
		return "Survey [name=" + name + ", author=" + author + ", questions=" + questions + ", isComplete=" + isComplete + ", isAnonymous=" + isAnonymous + ", getQuestions()=" + getQuestions() + ", displayResults()=" + displayResults()
				+ "]";
	}
}
