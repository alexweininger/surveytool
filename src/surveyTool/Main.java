/**
 * Main class to test and create a survey
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {	//Main method to execute and test survey
		
		Survey survey = new Survey("Survey Test", "Alex", true);
		
		Question name = new Question("name question", "What is your name?");
		survey.addQuestion(name);
		
		Question city = new Question("city question", "What city do you live in?");
		survey.addQuestion(city);
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		
		Question color = new OptionResponseQuestion("color", "What is your favorite color?", colors);
		survey.addQuestion(color);
		
		survey.displaySurvey(); // runs one instance of the survey
		survey.displaySurvey();
		//survey.initSurvey();
	}
}
