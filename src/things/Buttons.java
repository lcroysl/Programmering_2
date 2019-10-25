package things;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Buttons{

	GridPane buttonGrid;
	ArrayList<Button> numButtons;
	TextField inputField;
	ArrayList<Button> opButtons;

	public Buttons() {
		buttonGrid = new GridPane();
		buttonGrid.setHgap(10);
		buttonGrid.setVgap(10);
		buttonGrid.gridLinesVisibleProperty();
		numButtons = new ArrayList<Button>();
		inputField = new TextField();
		opButtons = new ArrayList<Button>();
		
		char[] buttonkey = { '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '0'};
		
		
		inputField.setMaxSize(170, 30);

		for (char key : buttonkey) {
			String buttonname = key + "";
			Button tempButton = new Button(buttonname);
			tempButton.setOnAction(event -> {inputField.textProperty().set(inputField.textProperty().get() + buttonname);
			});
			numButtons.add(tempButton);
		}

		int rowindex = 2;
		int columnindex = 0;
/*   
		for (int i = 0; i < buttonkey.length + 1; i++) {
			knappar.add(buttons.get(i), columnindex, rowindex);
			columnindex++;
			if (i % 2 == 0) {
				rowindex++;
				columnindex = 0;
			}
		}*/
		
		for (Button knapp : numButtons)
		{
			buttonGrid.add(knapp, ++columnindex, rowindex);
			knapp.setMinSize(30, 30);
			knapp.setMaxSize(30, 30);
			if (columnindex % 3 == 0)
			{
				columnindex =0;
				rowindex++;
			}
		}
		

		
		Spcbutton nw = new Spcbutton();
		buttonGrid.add(nw.equals, 3, 5);
		buttonGrid.add(nw.comma, 1, 5);
		
		opsb();
		
	}
	
	public void opsb() {
		
		char[] operators = {'÷','*','+','-'};
		
		for(char op : operators) {
			String opname = "" + op;
			Button temp2 = new Button(opname);
			temp2.setOnAction(event ->{inputField.textProperty().set(inputField.textProperty().get() + opname);});
			opButtons.add(temp2);
		}
		
		int rowindex2 = 2;
		
		for(Button ops : opButtons) {
			buttonGrid.add(ops, 4, rowindex2);
			ops.setMinSize(30, 30);
			ops.setMaxSize(30, 30);
			rowindex2 ++;
		}
		

	}

}
