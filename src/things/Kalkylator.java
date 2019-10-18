package things;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Kalkylator extends Application implements EventHandler<ActionEvent> {
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void handle(ActionEvent event) {
		
		
	}

	@Override
	public void start(Stage PrimaryStage) throws Exception {
		
		Buttons ko = new Buttons();
		Scene kalkylator = new Scene(ko.buttonGrid, 600, 600);
		PrimaryStage.setScene(kalkylator);
		PrimaryStage.show();
	}

}
