package com.ibm.swingy;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	JFrame newFrame;
	final JButton button;
	private String pathToFile;
	
	Window(String windowName, String buttonName,String pathToFile){
		this.pathToFile = pathToFile;
		this.button = new JButton(buttonName);
		this.newFrame = new JFrame(windowName);
		this.newFrame.getContentPane().add(button, BorderLayout.CENTER);
		this.newFrame.pack();
	    this.newFrame.setVisible(true);
	}
	
	public void writeFileAtButtonPush() {
		this.button.addActionListener(new ActionListener()
	      {
	         public void actionPerformed(ActionEvent e)
	         {
					FileWriter pr;
					try {
						pr = new FileWriter(pathToFile);
						pr.write("aaaa");
						pr.close();
						newFrame.dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	         }
	      });
	}
}
