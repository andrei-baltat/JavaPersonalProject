package com.ibm.swingy;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Window {
	protected static final String testCaseLabel = "Test Case";
	protected static final String stepsLabel = "Steps";
	protected static final String actualResultsLabel = "Actual Results";
	protected static final String statusLabel = "Status";
	protected static final String commentsLabel = "Comments";
	
	
	JTextField[] textFrames ;
	JTextArea[] textAreas;
	JToggleButton passButton;
	JToggleButton failButton;
	JButton submit;
	JFrame frame;
	
	
	
	Window(int frameDimension) {
		this.textFrames = new JTextField [3];
		this.textAreas = new JTextArea[2];
		
		this.textFrames[0] = new JTextField("Write here the Test Case title", 40);
		this.textFrames[1] = new JTextField("Write here the actual result", 40);
		this.textFrames[2] = new JTextField("Write here Issue number", 40);
		
		this.textAreas[0] = new JTextArea("Write here the steps");
		this.textAreas[1] = new JTextArea("Write here the comments");
		
		this.passButton = new JToggleButton("Pass");
		this.failButton = new JToggleButton("Fail"); 
		this.submit = new JButton("Submit");
		
		
		this.frame = new JFrame("Test Case Application");
	}
	
	static void showAndPackWindow() {
		
		
	}

}
