/**
 * Survey.java - Class for creating, editing, and controlling the filling out of a survey.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;
import java.util.Scanner;

public class Survey {

	private String name = "";				//Name of survey taker
	private String author = "";				//Name of author
	private ArrayList<Question> questions = new ArrayList<Question>(); // array list of the questions in the survey
	private boolean isAnonymous = true;		//If surveyor would like to be anonymous 

	// constructors
	public Survey(String name) {
		this.name = name;
	}
	
	/*Constructor that overloads;
	 * Adds author's name and if surveyor would like to be anonymous
	 */
	public Survey(String name, String author, boolean isAnonymous) {
		this.name = name;
		this.author = author;
		this.isAnonymous = isAnonymous;
	}
	
	public void setName(String name) { // set name
		this.name = name;
	}
	
	public String getName() { // get name
		return this.name;
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
			str += q.displayResults();
		}
		return str;
	}

	// displays the results/data of the survey in the console
	public void displayResults() {
		for(int i = 0; i < this.questions.size(); i++) {
			Question q = questions.get(i);
			q.displayResults();
		}
	}

	// takes in a question id, returns an ArrayList of the answers for that question
	public ArrayList<String> getResults(int questionId) {
		return this.questions.get(questionId).getResponses();
	}
	
	// display the survey in console
	public void displaySurvey(int index) {
		boolean valid = false;
		int i = 0;
		while(i < this.questions.size()) {
			Question q = this.questions.get(i);
			valid = q.displayQuestion();
			
			if(valid) { // if the response is not valid, do not move to the next question
				i++;
			}
		}
	}

	public String toString() {
		return "Survey [name=" + name + ", author=" + author + ", questions=" + questions + ", isAnonymous=" + isAnonymous + ", getQuestions()=" + getQuestions() + "]";
	}
}
