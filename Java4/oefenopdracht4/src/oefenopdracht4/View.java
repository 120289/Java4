package oefenopdracht4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JPanel{
	private JLabel display;
	private JButton button;

	public View(){
		display = new JLabel("text");
		this.add(display);
		 button = new JButton("Toon willekeurige naam");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				display.setText(controller.getRandomName());
				
			}
		});
		add(button);
	}
	
	public void setDisplay(String newText) {
		display.setText(newText);
	}
	
	public JButton getButton() {
		return button;
	}
	
	

}