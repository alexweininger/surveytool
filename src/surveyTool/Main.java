/**
 * Main class to test and create a survey
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */
package surveyTool;

public class Main {
	public static void main(String[] args) {	//Main method to execute and test survey
		Survey survey = new Survey("Survey Test", "Alex", true);
		Question name = new Question("name question", "What is your name?");
		survey.addQuestion(name);
		survey.initSurvey();
	}
}
