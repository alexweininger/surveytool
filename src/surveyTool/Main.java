/**
 * Main class to test and create the survey class, and add question objects to a survey.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/17/2018
 * 
 * 
 * 
 */

/**
 * The surveyTool program can create and facilitate surveys.  The bulk of the logic and programming has gone into implementing different types of questions (e.g. IntResponseQuestion), which are children to the parent class Question. 
 * The Survey class holds the questions, and holds the methods for creating a survey, and facilitating a survey.  This class also has methods for displaying the results of the survey.
 * 
 * The major changes to our program since part A are, the removal of unneeded classes, removal of unneeded variables, small reorganization of the class hierarchy (since we removed some), and the addition of the displayResults method.
 * We made these changes as we realized that some classes resembled other classes to much.  And that it would be more efficient and logical to remove them.  For example RatingResponse was removed as IntResponse can function in the same way.
 * In part b we also decided against creating a gui as it would distract us from completing the main goal, which was to implement a surveying program.
 * 
 * Some known errors or shortcomings in our program are that 
 * PROGRAM: Survey builder, create different types of questions extending from a parent Question class. Different classes require 
 * different parameters.
 * 
 * MAJOR CHANGES:
 * April 14th: JOptionPane/JPanel idea scrapped; learning curve and implementation proved too much hassle for timeframe
 * April 15th: Removed ListResponseQuestion, functionality was identical to the OptionResponseClass
 * April 15th: Removed RatingResponseQuestion, functionality identical to IntResponseQuestion
 * April 17th: Removed isAnoynymous parameter from Survey class
 * 
 * ERRORS/SHORTCOMINGS:
 * 
 * OVERRIDING EXAMPLES:
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
		osystems.add("Mac OS");
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
		
		//Test Response Limit
		TextResponseQuestion oneWord = new TextResponseQuestion("Personality", "Use one word to describe yourself", 8);
		survey.addQuestion(oneWord);
		
		survey.displaySurvey(0); // runs one instance of the survey
		//survey.displaySurvey(0);

		survey.displayResults(); // display the survey results
	}
}
