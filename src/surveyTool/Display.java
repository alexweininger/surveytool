/**
 * Interface to display a survey question with JPanel
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import javax.swing.JFrame;

interface Display {
	public boolean displayQuestion(); 
	
	/* May be changed to void when JPanel is fully implemented in all classes
	 * for not it returns String because we do not for sure know what we want it to return, 
	 * so String is a safe bet
	*/
}
