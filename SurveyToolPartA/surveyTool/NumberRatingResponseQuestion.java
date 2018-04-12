/**
 * NumberRatingResponseQuestion.java - Extends OptionResponseQuestion, making a number rating question easier to create.
 * 
 * @author Alex Weininger and Niraj Mali
 * @version 4/10/2018
 */


import java.util.ArrayList;

public class NumberRatingResponseQuestion extends OptionResponseQuestion implements Display {

    private int[] range = new int[2]; // defines the range of the number scale e.g [0, 10] means a 0-10 scale (we will
    // have to make sure entering [10, 0] does not break the program)

    // constructors
    public NumberRatingResponseQuestion(String name, String questionText, int responseLimit) {
        super(name, questionText);
    }

    public NumberRatingResponseQuestion(String name, String questionText, int responseLimit, int[] range) {
        super(name, questionText, initOptions(range));
        this.range = range;

    }

    public static ArrayList<String> initOptions(int[] range) { // this method is static because it needs to be invoked in the constructor
        ArrayList<String> options = new ArrayList<String>();
        for (int i = range[0]; i < range[1]; i++) {
            options.add("" + i); // add each number to the options list
        }
        return options; // return the options list
    }

    public void setRange(int[] range) { // set the options range
        this.range = range;
        super.setOptions(initOptions(range)); // since just changing this classes range variable does not change the options
        // list, we need to call super and initOptions again
    }

    public int[] getRange() { // return the range of the options
        return this.range;
    }

    public String displayQuestion() { // display this question in JPanel
        return null;
    }

    public String toString() { // toString
        return null;
    }
}
