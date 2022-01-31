package oefenopdracht4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

import javax.swing.*;

public class Controller implements PropertyChangeListener{
	Model model = new Model();
	View view;
	
	public Controller(View view) {
		this.view = view;
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.setPointer();	
			}
		};
		view.getButton().addActionListener(actionListener);
		model.addPropertyChangeListener(this);
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("newName")) {
			view.setDisplay(evt.getNewValue().toString());
		}
		
	}
}