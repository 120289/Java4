package oefenopdracht4;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class Model {
	private String[] lijst = {"Pascal","Kevin","Sidian","Andy","Gabriel"};
	private int pointer = 0;
	private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		pcs.addPropertyChangeListener(listener);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		pcs.removePropertyChangeListener(listener);
	}

	
	
	public String[] getLijst() {
		return lijst;
	}
	
	public void setPointer() {
		Random random = new Random();
		String oldValue = lijst[pointer];
		this.pointer = random.nextInt(lijst.length);
		pcs.firePropertyChange("newName", oldValue, lijst[pointer] );
	}
	
	public String getName() {
		return lijst[pointer];
	}
	
	
}