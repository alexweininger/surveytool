package surveyTool;

import java.awt.*;

import javax.swing.JFrame;

public class Survey {
	private String name = "";
	private int length = 0;

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
	public static void main(String args[]) {
		JFrame window = new JFrame("Survey");
		window.setVisible(true);
	}
}
