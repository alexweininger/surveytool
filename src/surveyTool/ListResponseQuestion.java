/**
 * ListResponseQuestion.java - Class for a question that implements a check-box system where multiple check-boxes are allowed to be checked.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;

import java.util.ArrayList;
import java.util.Scanner;
// ex
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ListResponseQuestion extends Question implements Display, ActionListener {

	private ArrayList<String> options; // list of options the user can select from
	private ArrayList<String> responses; // list of responses the user selects and submits
	private int responseLimit = -1; // the amount of options the user is allowed to submit
	private boolean submitted;

	// Constructor
	public ListResponseQuestion(String name, String questionText) {
		super(name, questionText);
	}

	// Overloaded Constructor: adds responseLimit
	public ListResponseQuestion(String name, String questionText, int responseLimit) {
		super(name, questionText);
		this.responseLimit = responseLimit;
	}

	// Overloaded Constructor: adds options to questions
	public ListResponseQuestion(String name, String questionText, int responseLimit, ArrayList<String> options) {
		super(name, questionText);
		this.responseLimit = responseLimit;
		this.options = options;
	}

	public void setOptions(ArrayList<String> options) { // set the list of options
		this.options = options;
	}

	public ArrayList<String> getOptions() { // get the list of options
		return this.options;
	}

	public void setResponses(ArrayList<String> responses) { // set the list of responses
		this.responses = responses;
	}

	public ArrayList<String> getResponses() { // get the list of responses
		return this.responses;
	}

	public void setResponseLimit(int limit) { // set the response limit
		this.responseLimit = limit;
	}

	public int getResponseLimit() { // get the response limit (int)
		return this.responseLimit;
	}

	public boolean isValidResponse(String response) { // check if the response if valid
		String[] answers = response.split(",\\s");
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i < answers.length; i++) {
			int n = 0;
			try {
				n = Integer.parseInt(answers[i]);
				temp.add(options.get(n - 1));
			} catch (NumberFormatException e) {
				System.out.println("Please enter only numbers seperated by commas");
				return false;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("One of your responses is not an option");
				return false;
			}
		}
		if (temp.size() > responseLimit || responseLimit < 0) {
			this.setResponses(temp);
			return true;
		}
		return false;
	}

	public boolean displayQuestion() { // display this question in JPanel
		Scanner kb = new Scanner(System.in);
		System.out.println(this.getText());
		for (int i = 0; i < this.options.size(); i++) {
			System.out.println(i + 1 + ". " + this.options.get(i));
		}
		System.out.println("Please respond with all numbers that apply, seperated with commas.");
		String response = kb.nextLine();

		return this.isValidResponse(response);
	}

	public void actionPerformed(ActionEvent e) {
		submitted = true;
	}

	@Override
	public String toString() {
		return "ListResponseQuestion [options=" + options + ", responses=" + responses + ", responseLimit=" + responseLimit + ", submitted=" + submitted + "]";
	}

}
