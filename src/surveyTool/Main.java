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
		
		Question city = new Question("city question", "What city do you live in?");
		survey.addQuestion(city);
		
		survey.displaySurvey(); // runs one instance of the survey
		//survey.initSurvey();
		
		System.out.println("hello");
	}
}
