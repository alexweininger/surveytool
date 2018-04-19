/**
 * Question.java - top level super class for all questions.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/17/2018
 */
package surveyTool;

import java.util.ArrayList;
import java.util.Scanner;

public class Question implements Display {

	private String name = ""; // name of the question
	private int id = -1; // based on number of questions already in survey
	private String questionText = ""; // the question
	private ArrayList<String> responses = new ArrayList<String>(); // list of user responses to the question

	private static int nextId = 1;

	// constructors
	public Question(String name) {
		this.name = name;
		this.id = nextId;
		nextId++;
	}
	
	public Question(String name, String questionText) {
		this.name = name;
		this.questionText = questionText;
		this.id = nextId;
		nextId++;
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

	public ArrayList<String> getResponses() { //Return responses to questions
		return this.responses;
	}
	
	public boolean isValidResponse(String response) { // check if the response is valid, e.g. if it is under the character limit
		this.addResponse(response);
		return true;
	}

	public boolean displayQuestion() { 	// required by interface to display question TODO
		Scanner kb = new Scanner(System.in);
		String str = this.getId() + ". " + this.getText() + "";
		str += "  (Please respond to this question in one line on one line, press enter to submit.)\n";
		System.out.println(str);
		
		String response = kb.nextLine(); // we do not validate this response as anything can be taken for a response to just a question
		System.out.println();
		
		return this.isValidResponse(response);
	}

	public void displayResults() { // print the results to the console
		System.out.println(this.getId() + ". Question: " + this.getName());
		System.out.println("| question: " + this.getText());
		System.out.println("| responses: " + this.getResponses() + "\n");
	}
	
	public String toString() { // Question toString()
		String str = "";
		str += "| ------ Question toString() -------\n";
		str += "| name: " + this.getName() + "\n";
		str += "| id: " + this.getId() + "\n";
		str += "| questionText: " + this.getText() + "\n";
		str += "| responses: " + this.getResponses() + "\n";
		str += "| ----------------------------------\n";
		return str;
	}
}
