/**
 * OptionResponseQuestion.java - Extends ListResponseQuestion, so that only 1 option may be selected and submitted.  (fill in the bubble)
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */

package surveyTool;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class OptionResponseQuestion extends ListResponseQuestion implements Display {
	
	// constructors
	public OptionResponseQuestion(String name, String questionText) {
		super(name, questionText, 1); // set the response limit to 1 by default
	}

	public OptionResponseQuestion(String name, String questionText, ArrayList<String> options) {
		super(name, questionText, 1, options); // set the response limit to 1 by default
	}

	public boolean isValidResponse(String resp) { // is the user response valid, returns boolean
	/*	for(int i = 0; i < ; i++) {
			if(resp == options.get(i)) {
				return true;
			}
		}*/
		return false;
	}

	public boolean displayQuestion() { // display the question in JPanel
		JFrame frame = new JFrame();
		String[] a = new String[this.getOptions().size()];
		JList<String> list = new JList<String>(this.getOptions().toArray(a));
		
		frame.add(list);
		frame.setVisible(true);
		
		return false; 
	}

	public String toString() { // toString
		return null;
	}

}
