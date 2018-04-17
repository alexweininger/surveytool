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
		String str = this.getId() + ". " + this.getText() + "\n";
		Str += "Please respond to this question in one line on one line, press enter to submit."
		System.out.println(str);

		String resp = kb.nextLine();
		
		if(this.isValidResponse(resp)) { // NIRAJ: If this method is run on an OptionResponse question will this.isValidResponse run the method inside this class or the OptionResponse class?
			this.addResponse(resp);
			return true;
		} else {
			return false;
		}
	}

	public void displayResults() { // print the results to the console
		System.out.println("|--- Question: " + this.getName() + " ---|");
		System.out.println("| questionText: " + this.getText() + "\n");
		System.out.println("| responses: " + this.getResponses() + "\n");
		// for (int i = 0; i < this.responses.size(); i++) {
		// 	System.out.println(this.responses.get(i));
		// }
		System.out.println("|----------------------------------------|");
	}
	
	public String toString() { // Question toString()
		String str = "";
		str += "| ------ Question toString() -------\n"
		str += "| name: " + this.getName() + "\n";
		str += "| id: " + this.getId() + "\n";
		str += "| questionText: " + this.getText() + "\n";
		str += "| responses: " + this.getResponses() + "\n";
		str += "| ----------------------------------\n"
		return str;
	}
}
