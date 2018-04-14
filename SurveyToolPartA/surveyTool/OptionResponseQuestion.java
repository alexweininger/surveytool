/**
 * OptionResponseQuestion.java - Extends ListResponseQuestion, so that only 1 option may be selected and submitted.  (fill in the bubble)
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */


import java.util.ArrayList;

public class OptionResponseQuestion extends ListResponseQuestion implements Display {

    // constructors
    public OptionResponseQuestion(String name, String questionText) {
        super(name, questionText, 1); // set the response limit to 1 by default
    }

    public OptionResponseQuestion(String name, String questionText, ArrayList<String> options) {
        super(name, questionText, 1, options); // set the response limit to 1 by default
    }

    public boolean isValidResponse(String resp) { // is the user response valid, returns boolean
        return true;
    }

    public String displayQuestion() { // display the question in JPanel
        return null;
    }

    public String toString() { // toString
        return null;
    }

}
