/**
 * Interface to display a survey question in the console.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/17/2018
 */
package surveyTool;

interface Display {
	public boolean displayQuestion(); // return boolean which represents if the response was valid (if not repeat thequestion)
	public void displayResults(); // displays the results or the data in the console
}
