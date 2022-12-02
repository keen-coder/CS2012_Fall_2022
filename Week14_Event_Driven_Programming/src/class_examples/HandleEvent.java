package class_examples;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class HandleEvent extends Application {
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		
		Button btOK = new Button("OK");		
		Button btCancel = new Button("Cancel");
		
		//Register event handler with event source object, 
		//using event registration method.
		btOK.setOnAction(new OKHandler());
		btCancel.setOnAction(new CancelHandler());

		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		
		pane.getChildren().addAll(btOK, btCancel);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEvent"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage		
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}
}



class OKHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		Object eventObj = event.getSource();
		
		
		if (eventObj instanceof Button) {
			Button b = (Button)(eventObj);
			System.out.println(b.getText());
		}
			
		System.out.println("OK button was clicked.");
		System.out.println("Data will now be processed");
	}
}

class CancelHandler implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Cancel button clicked");
	}
}

//class BothHandler implements EventHandler<ActionEvent> {
//	@Override
//	public void handle(ActionEvent event) {
//
//		
//		Object eventObject = event.getSource();
//		
//		if ( !(eventObject instanceof Button)) {
//			return;
//		}
//		
//		Button eventButton = (Button)eventObject; 
//
//		System.out.println(eventButton.getText() + " button was clicked.");
//	}
//}
