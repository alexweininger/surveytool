/**
 * Display.java - Interface to display a survey question in the console.
 * This interface forces classes that implement it to provide a displayQuestion method, and a displayResults method.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version last updated 4/18/2018
 */
package surveyTool;

interface Display {
	public boolean displayQuestion(); // return boolean which represents if the response was valid (if not repeat thequestion)
	public void displayResults(); // displays the results or the data in the console
}
