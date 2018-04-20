/**
 * Main class to test and create the survey class, and add question objects to a survey.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/17/2018
 * 
 * The surveyTool program can create and facilitate surveys.  The bulk of the logic and programming has gone into implementing different types of questions (e.g. IntResponseQuestion), which are children to the parent class Question. 
 * The Survey class holds the questions, and holds the methods for creating a survey, and facilitating a survey.  This class also has methods for displaying the results of the survey.
 * 
 * The major changes to our program since part A are, the removal of unneeded classes, removal of unneeded variables, small reorganization of the class hierarchy (since we removed some), and the addition of the displayResults method.
 * We made these changes as we realized that some classes resembled other classes to much.  And that it would be more efficient and logical to remove them.  For example RatingResponse was removed as IntResponse can function in the same way.
 * In part b we also decided against creating a GUI as it would distract us from completing the main goal, which was to implement a surveying program.
 * 
 * Some known errors or shortcomings in our program are that this program does not store data anywhere outside of the runtime.  So, all data inside surveys is erased after the program stops.
 * 
 * To run this program you will need to run Main.java.  If you would like to create your own survey, you will do it inside Main.java as well.
 * 
 * Overriding methods are isValidResponse, which is in Question.java and then overridden in the TextResponse class, and in most other classes.  DisplayResults is also overloaded in the OptionResponse class, and each toString is overloaded.
 * The use of super is located within the displayQuestion methods in the TextResponse class, and IntResponse class.
 * 
 * MAJOR CHANGELOG:
 * April 14th: JOptionPane/JPanel idea scrapped; learning curve and implementation proved too much hassle for timeframe
 * April 15th: Removed ListResponseQuestion, functionality was identical to the OptionResponseClass
 * April 15th: Removed RatingResponseQuestion, functionality identical to IntResponseQuestion
 * April 17th: Removed isAnoynymous parameter from Survey class
 * 
 */
package surveyTool;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) { // Main method to execute and test survey
		
		//Create Survey
		Survey survey = new Survey("Survey Test", "Alex");

		//Test Question Class
		Question name = new Question("Name", "What is your name?"); // 1
		survey.addQuestion(name);

		//Test TextResponseQuestion
		Question city = new TextResponseQuestion("City", "What city do you live in?"); // 2
		survey.addQuestion(city);

		int[] range = {0, 130};
		IntResponseQuestion age = new IntResponseQuestion("Age", "How old are you?", range); // 3
		survey.addQuestion(age);
		
		
		survey.removeQuestion(2);
		System.out.println(survey.toString());
		
		survey.addQuestion(age);
		
		//OptionResponseQuestions Test Case 1
		ArrayList<String> osystems = new ArrayList<String>();
		osystems.add("Mac OS");
		osystems.add("Windows");
		osystems.add("Linux");
		OptionResponseQuestion os = new OptionResponseQuestion("Operating System", "What OS do you use?", osystems); // 4
		survey.addQuestion(os);
		
		//OptionResponseQuestion Test Case 2
		OptionResponseQuestion color = new OptionResponseQuestion("Favorite Color", "Which color is your favorite?");
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Blue");
		colorList.add("Red");
		colorList.add("Yellow");
		colorList.add("Green");
		colorList.add("Other");
		color.setOptions(colorList);
		survey.addQuestion(color);
		
		//Boolean Test Case 
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
