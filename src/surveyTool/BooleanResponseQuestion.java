/**
 * BooleanResponseQuestion.java 
 * --Extends OptionResponseQuestion, making a true of false question easier to create
 * --by automatically setting the options in the constructor to "true" or "false".
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/17/2018
 */
package surveyTool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BooleanResponseQuestion extends OptionResponseQuestion implements Display {

	// make an ArrayList of String containing "true" and "false"
	static ArrayList<String> options = new ArrayList<String>(Arrays.asList("true", "false"));

	// constructor
	public BooleanResponseQuestion(String name, String questionText) {
		super(name, questionText, options);
	}

	public boolean isValidResponse(String response) { // check if the user response if valid
		return super.isValidResponse(response); // new
	}

	public boolean displayQuestion() { // display the question in console and get the users response, validate it, and
										// add it to the responses list
		Scanner kb = new Scanner(System.in);
		String str = this.getId() + ". " + this.getText() + "  (Please respond with either 1 for true, or 2 for false)\n";
		System.out.println(str);

		String resp = kb.nextLine();
		System.out.println();
		if (this.isValidResponse(resp)) { 
			return true;
		} else {
			return false;
		}
	}

	public void displayResults() { // display the results in console
		System.out.println(this.getId() + ". BooleanResponse: " + this.getName());
		System.out.println("| question: " + this.getText());
		System.out.println("| options: [true, false]");
		System.out.println("| responses: " + this.getResponses() + "\n");
	}

	public String toString() { // BooleanResponse toString()
		String str = "";
		str += "| ------ BooleanResponse toString() -------\n";
		str += "| name: " + this.getName() + "\n";
		str += "| id: " + this.getId() + "\n";
		str += "| questionText: " + this.getText() + "\n";
		str += "| options: " + this.getResponses() + "\n";
		str += "| responses: " + this.getResponses() + "\n";
		str += "| ----------------------------------------\n";
		return str;
	}

}