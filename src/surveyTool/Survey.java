package surveyTool;

import java.awt.*;

import javax.swing.JFrame;

public class Survey {
	private String name = "";
	private String author = "";
	private int length = 0;
	private int numberOfQuestions = 0;
	private Question[] questions;

	public Survey(String name) {
		this.name = name;
	}

	public Question[] getQuestions() {
		return null;
	}

	public void addQuestion(Question question) {

	}

	public boolean removeQuestion(int questionId) {
		return false;
	}

	public String getResults() {
		return null;
	}

	public String getAnswer(int questionId) {
		return null;
	}

	public String toString() {
		return null;
	}
}
