package things;


import javafx.scene.control.Button;

public class Spcbutton{
	
	
	Button equals;
	Button clear;

	public Spcbutton() {
		
		
		equals = new Button("=");
		equals.setMinSize(30, 30);
		clear = new Button("C");
		clear.setMinSize(30, 30);
		
	}

}
