package com.andrei.app;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.JTextComponent;

public class FormField extends JPanel {
	JTextComponent textComponent;
	String label;
	
	FormField( String label, JTextComponent textComponent ){
		this.label = label;
		this.textComponent = textComponent;
		this.textComponent.setToolTipText("Write here " + label );
		BoxLayout layout = new BoxLayout(this, BoxLayout.X_AXIS);

		this.setLayout(layout);
		this.add(new JLabel(label));
		this.add(textComponent);

	}
	
	public String getText() {
		
		return this.textComponent.getText();
	}
	
	public String getLabel() {
		
		return this.label;
	}

}
