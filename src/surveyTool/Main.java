/**
 * Main class to test and create a survey
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) { // Main method to execute and test survey

		Survey survey = new Survey("Survey Test", "Alex", true);

		Question name = new Question("name question", "What is your name?");
		survey.addQuestion(name);

		Question city = new TextResponseQuestion("city question", "What city do you live in?");
		survey.addQuestion(city);

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("green");
		colors.add("red");
		colors.add("blue");

		int[] range = {0, 130};
		IntResponseQuestion age = new IntResponseQuestion("age", "How old are you?", range);
		survey.addQuestion(age);
		
		ArrayList<String> osystems = new ArrayList<String>();
		osystems.add("mac OS");
		osystems.add("Windows");
		osystems.add("Linux");
		
		OptionResponseQuestion os = new OptionResponseQuestion("os", "What OS do you use?", osystems);
		
		BooleanResponseQuestion math = new BooleanResponseQuestion("math", "Is 2 + 2 = 3?");
		survey.addQuestion(math);

		survey.displaySurvey(0); // runs one instance of the survey
		survey.displaySurvey(0);
		// survey.initSurvey();
	}
}
