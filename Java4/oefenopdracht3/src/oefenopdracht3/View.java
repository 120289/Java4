package oefenopdracht3;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JPanel{
 private JLabel display;
 public View(){
 display = new JLabel("text");
 this.add(display);
 }
 public void setDisplay(String text){
 display.setText(text);
 }
}