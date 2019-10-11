package things;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Buttons {

	static GridPane knappar;
	ArrayList<Button> buttons;
	ArrayList<Button> opbuttons;
	TextField inputs;

	public Buttons() {
		knappar = new GridPane();
		knappar.setHgap(10);
		knappar.setVgap(10);
		knappar.gridLinesVisibleProperty();
		buttons = new ArrayList<Button>();
		opbuttons = new ArrayList<Button>();

		char[] buttonkey = { '1', '2', '3', '4', '5', '6', '7', '8', '9', ',', '0'};

		for (char key : buttonkey) {
			String buttonname = key + "";
			Button tempButton = new Button(buttonname);
			tempButton.setOnAction(event -> {inputs.textProperty().set(inputs.);
			});
			buttons.add(tempButton);
		}

		int rowindex = 0;
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
		
		for (Button knapp : buttons)
		{
			knappar.add(knapp, ++columnindex, rowindex);
			knapp.setMinSize(30, 30);
			knapp.setMaxSize(30, 30);
			if (columnindex % 3 == 0)
			{
				columnindex =0;
				rowindex++;
			}
		}
		
		char[] operatorB = {'÷','*','+','-'};
		
		for(char op : operatorB) {
			String opname = "" + op;
			Button temp2 = new Button(opname);
			temp2.setOnAction(event ->{});
			opbuttons.add(temp2);
		}
		
		int rowindex2 = 0;
		
		for(Button ops : opbuttons) {
			knappar.add(ops, 4, rowindex2);
			ops.setMinSize(30, 30);
			ops.setMaxSize(30, 30);
			rowindex2 ++;
			
		}

	}

}
