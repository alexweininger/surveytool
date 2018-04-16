/**
 * Question.java - top level super class for all questions.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

import java.awt.*;

public class Question implements Display {
	private String name = ""; // name of the question
	private int id = -1; // based on number of questions already in survey
	private String questionText = ""; // the question
	private ArrayList<String> responses = new ArrayList<String>(); // list of user responses to the question

	// constructors
	public Question(String name) {
		this.name = name;
		id++;
	}
	
	public Question(String name, String questionText) {
		this.name = name;
		this.questionText = questionText;
	}

	public void setName(String name) { // set the name of the question
		this.name = name;
	}

	public String getName() { // get the name of the question
		return this.name;
	}

	public int getId() { // get the id of the question
		return this.id;
	}

	public void setText(String text) { // set the question text of the question
		this.questionText = text;
	}

	public String getText() {
		return this.questionText;
	}

	public void addResponse(String response) {  // add the String to the end of the responses list
		this.responses.add(response);
	}

	public void setResponses(ArrayList<String> responses) {
		this.responses = responses;
	}

	//Return responses to questions
	public ArrayList<String> getResponses() {
		return this.responses;
	}

	//Validates response(range, data type, etc.)
	public boolean isValidResponse(String response) {
		return true;
	}

	//Required by interface to display question TODO
	public boolean displayQuestion() {
		Scanner kb = new Scanner(System.in);
		
		System.out.println(this.getText());
		String resp = kb.nextLine();
		
		if(this.isValidResponse(resp)) {
			this.addResponse(resp);
			return true;
		}else {
			return false;
		}
	}

	public void displayResults() {
		System.out.println("Responses for question: " + this.getName());
		for (int i = 0; i < this.responses.size(); i++) {
			System.out.println(this.responses.get(i));
		}
	}
	
	public String toString() {
		return "Question [name=" + name + ", id=" + id + ", questionText=" + questionText + ", responses=" + responses + "]";
	}
}
