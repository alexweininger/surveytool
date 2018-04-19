/**
 * Survey.java - Class for creating, editing, and controlling the filling out of a survey.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/17/2018
 */
package surveyTool;

import java.util.ArrayList;
import java.util.Scanner;

public class Survey {

	private String name = ""; // name of survey taker
	private String author = "not available"; // name of author, set to "not available" by default
	private ArrayList<Question> questions = new ArrayList<Question>(); // array list of the questions in the survey

	// constructors
	public Survey(String name) {
		this.name = name;
	}

	/*
	 * Constructor that overloads; Adds author's name and if surveyor would like to
	 * be anonymous
	 */
	public Survey(String name, String author) {
		this.name = name;
		this.author = author;
	}

	// getters

	public String getName() { // get name
		return this.name;
	}

	public String getAuthor() { // get author
		return this.author;
	}

	public ArrayList<Question> getQuestions() { // returns an ArrayList of questions in the survey
		return this.questions;
	}

	public ArrayList<String> getResults(int questionId) { // takes in a question id, returns an ArrayList of the answers for that question
		return this.questions.get(questionId).getResponses();
	}

	public String getResultsAsString() { // returns the displayResults string instead of printing to console
		String str = "";
		for (int i = 0; i < this.questions.size(); i++) {
			Question q = questions.get(i);
			q.displayResults();
		}
		return str;
	}

	// setters

	public void setName(String name) { // set name
		this.name = name;
	}

	public void setAuthor(String author) { // set author
		this.author = author;
	}

	public void setQuestion(ArrayList<Question> questions) { // set questions list
		this.questions = questions;
	}

	public void addQuestion(Question question) { // adds a question to the survey
		this.questions.add(question);
	}

	public boolean removeQuestion(int questionId) { // removes the specified question from the survey
		try {
			this.questions.remove(questionId);
			return true;
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}

	// display methods

	public void displaySurvey(int index) { // display the survey in console

		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to participate in " + this.getName() + "? (Response with y or n)\n");
		String response = kb.next();
		System.out.println();
		if (response.equalsIgnoreCase("n")) {
			System.out.println("That's okay, come back soon!");
			System.exit(0);
		} else {
			System.out.println("---------- " + this.getName() + " by " + this.getAuthor() + "-----------\n");
			boolean valid = false;
			int i = 0;
			while (i < this.questions.size()) {
				Question q = this.questions.get(i);
				valid = q.displayQuestion();

				if (valid) { // if the response is not valid, do not move to the next question
					i++;
				}
			}
			System.out.println("Thank you for participating in the survey. \n");
		}
	}

	public void displayResults() { // displays the results/data of the survey in the console
		System.out.println("------------ " + this.getName() + " Results ----------------\n");
		for (int i = 0; i < this.questions.size(); i++) {
			Question q = questions.get(i);
			q.displayResults();
		}
		System.out.println("-------------------------------------------------------------");
	}

	public String toString() { // Survey toString
		String str = "";
		str += "------ Survey toString -------\n";
		str += "| name: " + this.getName() + "\n";
		str += "| author: " + this.getAuthor() + "\n";
		str += "| questions: " + this.getQuestions() + "\n";
		str += "-------------------------------------------\n";
		return str;
	}
}
