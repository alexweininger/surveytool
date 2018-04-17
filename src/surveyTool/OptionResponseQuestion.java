/**
 * OptionResponseQuestion.java - Extends ListResponseQuestion, so that only 1 option may be selected and submitted.  (fill in the bubble)
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/17/2018
 */

package surveyTool;

import java.util.ArrayList;

public class OptionResponseQuestion extends Question implements Display {
	protected ArrayList<String> options; // list of options the user can select from

	// constructors
	public OptionResponseQuestion(String name, String questionText) {
		super(name, questionText);
	}

	public OptionResponseQuestion(String name, String questionText, ArrayList<String> options) {
		super(name, questionText);
		this.options = options;
	}
	
	public void setOptions(ArrayList<String> options) { // set the list of options
		this.options = options;
	}

	public ArrayList<String> getOptions() { // get the list of options
		return this.options;
	}

	public boolean isValidResponse(String response) { // Is the user response valid, returns boolean.  This method is called inside of the displayQuestion method.
		for(int i = 0; i < this.getOptions().size(); i++) {
			if(resp.equals("" + i + 1)){ // checking if the user input string matches an index string (adding 1 because list indexes start at 0)
				System.out.println("INFO: OptionResponse.isValid - user input is valid");
				super.addResponse(this.getOptions().get(i)); // setting the response to the corresponding option
				return true;
			}
		}
		System.out.println("INFO: OptionResponse.isValid - Please enter a number within the answer range.");
		return false;
	}

	public boolean displayQuestion() { // display the question in the console and return if it is valid
		Scanner kb = new Scanner(System.in);
		String str = this.getId() + ". " + this.getText() + "\n";
		str += "--- choose the best answer ---\n"
		for(int i = 0; i < this.getOptions(); i++) {
			str += i + 2 + ". " + this.getOptions().get(i) + "\n";
		}
		str += "--- Please respond to this question with the corresponding option number. ---";
		System.out.println(str);

		String resp = kb.nextLine();
		
		if(this.isValidResponse(resp)) { // NIRAJ: If this method is run on an OptionResponse question will this.isValidResponse run the method inside this class or the OptionResponse class?
			this.addResponse(resp);
			System.out.println("INFO: OptionResponse.displayQuestion - added response: " + resp + " to the response list.");
			return true;
		} else {
			return false;
		}
	}
	}

	public void displayResults() { // displays the OptionResponse results in the console
		System.out.println("|--- OptionResponse: " + this.getName() + " ---|");
		System.out.println("| questionText: " + this.getText() + "\n");
		System.out.println("| options: " + this.getResponses() + "\n");
		System.out.println("| responses: " + this.getResponses() + "\n");
		// for (int i = 0; i < this.responses.size(); i++) {
		// 	System.out.println(this.responses.get(i));
		// }
		System.out.println("|----------------------------------------|");
	}

	public String toString() { // OptionResponse toString()
		String str = "";
		str += "| ------ OptionResponse toString() -------\n"
		str += "| name: " + this.getName() + "\n";
		str += "| id: " + this.getId() + "\n";
		str += "| questionText: " + this.getText() + "\n";
		str += "| options: " + this.getResponses() + "\n";
		str += "| responses: " + this.getResponses() + "\n";
		str += "| ----------------------------------------\n"
		return str;
	}

}
