package oefenopdracht4;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Runner {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		View view = new View();
		Controller controller = new Controller(view);
		frame.setContentPane(view);
		frame.setVisible(true);
	}
}