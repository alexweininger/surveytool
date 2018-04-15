/**
 * Survey.java - Class for creating, editing, and controlling the filling out of a survey.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;

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
	
//	public void setFrame(JFrame frame) {
//		this.frame = frame;
//	}
//	
//	public JFrame getFrame() {
//		return this.frame;
//	}

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
		for(int i = 0; i < this.questions.size(); i++) {
			Question q = questions.get(i);
			q.displayResults();
		}
	}

	// takes in a question id, returns an ArrayList of the answers for that question
	public ArrayList<String> getResults(int questionId) {
		return this.questions.get(questionId).getResponses();
	}
	
	// runs one instance of the survey, to fill out multiple responses to a survey you need to run initSurvey more than once
	public void initSurvey() {
		Scanner kb = new Scanner(System.in);
		this.toString();
		for(int i = 0; i < this.questions.size(); i++) {
			Question q = this.questions.get(i);
			System.out.println(q.getText());
			String resp = kb.nextLine();
			q.addResponse(resp);
		}
		this.displayResults();
	}
	
	// display the survey in console
	public void displaySurvey(int index) {
		boolean valid = false;
		int i = 0;
		while(i < this.questions.size()) {
			Question q = this.questions.get(i);
			valid = q.displayQuestion();
			
			if(valid) {
				i++;
			}
		}
		
		this.displayResults();
	}

	public String toString() {
		return "Survey [name=" + name + ", author=" + author + ", questions=" + questions + ", isAnonymous=" + isAnonymous + ", getQuestions()=" + getQuestions() + "]";
	}
}
