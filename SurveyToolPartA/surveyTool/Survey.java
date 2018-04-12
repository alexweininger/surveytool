/**
 * Survey.java - Class for creating, editing, and controlling the filling out of a survey.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */


import java.util.ArrayList;

public class Survey {
    private String name = "";
    private String author = "";
    private ArrayList<Question> questions; // array list of the questions in the survey
    private boolean isAnonymous = true;

    public Survey(String name) {
        this.name = name;
    }

    public Survey(String name, String author, boolean isAnonymous) {
        this.name = name;
        this.author = author;
        this.isAnonymous = isAnonymous;
    }

    // returns an ArrayList of questions in the survey
    public ArrayList<Question> getQuestions() {
        return null;
    }

    // adds a question to the survey
    public void addQuestion(Question question) {

    }

    // removes the specified question from the survey
    public boolean removeQuestion(int questionId) {
        return false;
    }

    // returns the displayResults string instead of printing to console
    public String getResultsAsString() {
        return null;
    }

    // displays the results/data of the survey in
    public String displayResults() {
        return null;
    }

    // takes in a question id, returns an ArrayList of the answers for that question
    public ArrayList<Question> getResults(int questionId) {
        return null;
    }

    public String toString() {
        return "Survey [name=" + name + ", author=" + author + ", questions=" + questions + ", isAnonymous=" + isAnonymous + ", getQuestions()=" + getQuestions() + ", displayResults()=" + displayResults() + "]";
    }
}
