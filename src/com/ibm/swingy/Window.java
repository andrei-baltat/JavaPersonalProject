package com.andrei.app;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.text.JTextComponent;

public class Window {
	protected static final String testCaseLabel = "Test Case";
	protected static final String stepsLabel = "Steps";
	protected static final String actualResultsLabel = "Actual Results";
	protected static final String statusLabel = "Status";
	protected static final String commentsLabel = "Comments";
	
	
	List<FormField> formFields;
	JToggleButton passButton;
	JToggleButton failButton;
	JButton submit;
	JFrame frame;
	JPanel panel;
	BoxLayout layout;
	
	
	
	
	Window(int frameDimension) {
		this.formFields = new ArrayList<>();
		this.formFields.add(new FormField(testCaseLabel, new JTextField(40)));
		this.formFields.add(new FormField(stepsLabel, new JTextField(40)));
		this.formFields.add(new FormField(actualResultsLabel, new JTextField(40)));
		this.formFields.add(new FormField(commentsLabel, new JTextArea()));
		this.passButton = new JToggleButton("Pass");
		this.failButton = new JToggleButton("Fail"); 
		this.submit = new JButton("Submit");
		this.panel = new JPanel();
		this.frame = new JFrame("Test Case Application");
		this.layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		this.panel.setLayout(this.layout);
		this.frame.setSize(frameDimension, frameDimension);
		this.frame.add(this.panel);
		this.formFields.forEach((formField) -> this.panel.add(formField));
		this.panel.add(passButton);
		this.panel.add(failButton);

		this.submit.addMouseListener(new MouseAdapter() {
		

			@Override
			public void mouseClicked(MouseEvent arg0) {
				StringBuilder sbHeader = new StringBuilder();
				StringBuilder sbContent = new StringBuilder();
				formFields.stream().forEach((formField) -> sbHeader.append("|*" + formField.getLabel() + "*|"));
				formFields.stream().forEach((formField) -> sbContent.append("|" + formField.getText() + "|"));

				// TODO Auto-generated method stub
				
				// pe cele d mai jos le adaug listenerului de button
				// o functie validate
				//o functie save to disk
				
				
				
			}

			
		});
//		
//
//		
//		//Listenerul de click pe submit
//
//
	}
	
	public void showAndPackWindow() {
		this.frame.pack();
		this.frame.setVisible(true);
		
	}
	
}
