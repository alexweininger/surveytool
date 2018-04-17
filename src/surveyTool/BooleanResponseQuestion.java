/**
 * BooleanResponseQuestion.java 
 * --Extends OptionResponseQuestion, making a true of false question easier to create
 * --by automatically setting the options in the constructor to "true" or "false".
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;
import java.util.Arrays;

public class BooleanResponseQuestion extends OptionResponseQuestion implements Display {

	// make an ArrayList of String containing "true" and "false"
	static ArrayList<String> options = new ArrayList<String>(Arrays.asList("true", "false"));

	// constructor
	public BooleanResponseQuestion(String name, String questionText) {

		super(name, questionText, options);
	}

	public boolean isValidResponse(String response) { // check if the user response if valid
		// if (resp.equalsIgnoreCase("1") || resp.equalsIgnoreCase("2")) {
			
		// 	System.out.println(resp);
			
		// 	String response = (resp.equalsIgnoreCase("1")) ? "true" : "false";
			
		// 	super.addResponse(response);
			
		// 	System.out.println(response);
		// 	System.out.println(this.toString());
			
		// 	return true;
			
		// } else {
		// 	return false;
		// }

		return super.isValidResponse(response); // new
	}

	public boolean displayQuestion() { // display the question in console
		return true;
	}

	public void displayResults() { // display the results in console
		System.out.println("|--- BooleanResponse: " + this.getName() + " ---|");
		System.out.println("| questionText: " + this.getText() + "\n");
		System.out.println("| options: [true, false]\n");
		System.out.println("| responses: " + this.getResponses() + "\n");
		// for (int i = 0; i < this.responses.size(); i++) {
		// 	System.out.println(this.responses.get(i));
		// }
		System.out.println("|----------------------------------------|");
	}

	public String toString() { // BooleanResponse toString()
		String str = "";
		str += "| ------ BooleanResponse toString() -------\n"
		str += "| name: " + this.getName() + "\n";
		str += "| id: " + this.getId() + "\n";
		str += "| questionText: " + this.getText() + "\n";
		str += "| options: " + this.getResponses() + "\n";
		str += "| responses: " + this.getResponses() + "\n";
		str += "| ----------------------------------------\n"
		return str;
	}

}
