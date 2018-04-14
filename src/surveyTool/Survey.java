/**
 * Survey.java - Class for creating, editing, and controlling the filling out of a survey.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;

public class Survey {
	private String name = "";				//Name of survey taker
	private String author = "";				//Name of author
	private ArrayList<Question> questions; // array list of the questions in the survey
	private boolean isAnonymous = true;		//If surveyor would like to be anonymous 

<<<<<<< HEAD
	//Constructor that takes only name of surveyor
	public Survey(String name) {	//Constructor that takes only name of surveyor
=======
	// constructors
	public Survey(String name) {
>>>>>>> e2ccb401d52073a9a86bb6ab25f77f16e047862a
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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
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
			str+= q.getText() + "\nResponses:\n";
			str+= q.getResponses().toString() + "\n";
		}
		return str;
	}
<<<<<<< HEAD
	
	// displays the results/data of the survey in
	public String displayResults() {
		return null;
=======

	// displays the results/data of the survey in the console
	public void displayResults() {
		String str = "";
		for(int i = 0; i < this.questions.size(); i++) {
			Question q = questions.get(i);
			str+= q.getText() + "\nResponses:\n";
			str+= q.getResponses().toString() + "\n";
		}
		System.out.println(str);
>>>>>>> e2ccb401d52073a9a86bb6ab25f77f16e047862a
	}

	// takes in a question id, returns an ArrayList of the answers for that question
	public ArrayList<String> getResults(int questionId) {
		return this.questions.get(questionId).getResponses();
	}

	public String toString() {
<<<<<<< HEAD
		return "Survey [name=" + name + ", author=" + author + ", questions=" + questions + ", isAnonymous=" + isAnonymous + ", getQuestions()=" + getQuestions() + ", displayResults()=" + displayResults()
				+ "]";
=======
		return "Survey [name=" + name + ", author=" + author + ", questions=" + questions + ", isAnonymous=" + isAnonymous + ", getQuestions()=" + getQuestions() + "]";
>>>>>>> e2ccb401d52073a9a86bb6ab25f77f16e047862a
	}
}
