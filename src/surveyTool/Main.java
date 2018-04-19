/**
 * Main class to test and create the survey class, and add question objects to a survey.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/17/2018
 */
package surveyTool;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) { // Main method to execute and test survey

		Survey survey = new Survey("Survey Test", "Alex");

		Question name = new Question("Name", "What is your name?"); // 1
		survey.addQuestion(name);

		Question city = new TextResponseQuestion("City", "What city do you live in?"); // 2
		survey.addQuestion(city);

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("green");
		colors.add("red");
		colors.add("blue");

		int[] range = {0, 130};
		IntResponseQuestion age = new IntResponseQuestion("Age", "How old are you?", range); // 3
		survey.addQuestion(age);
		
		ArrayList<String> osystems = new ArrayList<String>();
		osystems.add("mac OS");
		osystems.add("Windows");
		osystems.add("Linux");
		
		OptionResponseQuestion os = new OptionResponseQuestion("Operating System", "What OS do you use?", osystems); // 4
		survey.addQuestion(os);

		// what happens if we make this an instance of the OptionsResponse class and assign it to a BooleanResponse
		// OptionResponseQuestion math2 = new BooleanResponseQuestion("math2", "Is 3 + 2 = 5?");
		// WAIT it will work if we make it of type Question, like so:
		// Question math3 = new BooleanResponseQuestion("math3", "Is 5 + 3 = 8?");

		BooleanResponseQuestion math = new BooleanResponseQuestion("Math", "True or False, is 2 + 2 = 3?"); // 5
		survey.addQuestion(math);

		survey.displaySurvey(0); // runs one instance of the survey
		//survey.displaySurvey(0);

		survey.displayResults(); // display the survey results
	}
}
