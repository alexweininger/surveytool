/**
 * ListResponseQuestion.java - Class for a question that implements a check-box system where multiple check-boxes are allowed to be checked.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;
import java.util.ArrayList;

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

public class ListResponseQuestion extends Question implements Display, ActionListener{

	private ArrayList<String> options; // list of options the user can select from
	private ArrayList<String> responses; // list of responses the user selects and submits
	private int responseLimit = -1; // the amount of options the user is allowed to submit
	private boolean submitted;

	// Constructor
	public ListResponseQuestion(String name, String questionText) {
		super(name, questionText);
	}
	
	//Overloaded Constructor: adds responseLimit
	public ListResponseQuestion(String name, String questionText, int responseLimit) {
		super(name, questionText);
		this.responseLimit = responseLimit;
	}

	//Overloaded Constructor: adds options to questions
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

	public boolean isValidResponse(ArrayList<String> resp) { // check if the response if valid
		return true;
	}

	public boolean displayQuestion() { // display this question in JPanel
		
		 String title = this.getName();
		    JFrame frame = new JFrame(title);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    JPanel panel = new JPanel(new GridLayout(0, 1));
		    Border border = BorderFactory.createTitledBorder("Pizza Toppings");
		    panel.setBorder(border);
		    JCheckBox check = new JCheckBox("Anchovies");
		    panel.add(check);
		    check = new JCheckBox("Garlic");
		    panel.add(check);
		    check = new JCheckBox("Onions");
		    panel.add(check);
		    check = new JCheckBox("Pepperoni");
		    panel.add(check);
		    check = new JCheckBox("Spinach");
		    panel.add(check);
		    JButton button = new JButton("Submit");
		    
		    button.addActionListener(this);
		    Container contentPane = frame.getContentPane();
		    contentPane.add(panel, BorderLayout.CENTER);
		    contentPane.add(button, BorderLayout.SOUTH);
		    frame.setSize(300, 200);
		    frame.setVisible(true);
		    submitted = false;
		    
		    while(!submitted) {
		    	System.out.print("");
		    }
		    
		return true;
	}
	
    public void actionPerformed(ActionEvent e) {
       submitted = true;
    }
    
	public String toString() { // toString
		return null;
	}

}
