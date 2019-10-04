package things;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;



public class Buttons{
	
	static GridPane knappar;
	Button buttons;

	public Buttons(){
	knappar = new GridPane();
	knappar.setHgap(10);
	knappar.setVgap(10);
	knappar.gridLinesVisibleProperty();
	
	
	char[] buttonkey = {'1','2','3','4','5','6','7','8','9','+','-'};
	
	for(char key : buttonkey) {
		String buttonname = key + "";
		buttons = new Button(buttonname);
		buttons.setOnAction(event ->{});
	}
	
	
	int rowindex = 0;
	int columnindex = 0;
	
	for (int i = 1; i < buttonkey.length+1; i++) {
		knappar.add(buttons, columnindex, rowindex);
		columnindex++;
		if(i % 3 == 0 ) {
			rowindex++;
			columnindex -=3;
		}
	}
	knappar.getChildren().addAll(buttons);
	
	
	}

}
