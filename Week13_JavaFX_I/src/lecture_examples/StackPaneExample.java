package lecture_examples;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneExample extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//StackPane will stack all things added to it in the center
		//of the pane.
		StackPane pane = new StackPane();
		
		Button btOne = new Button("THIS IS BUTTON ONE");
		Button btTwo = new Button("Button Two");
		
		ObservableList<Node> nodes = pane.getChildren();
		
		nodes.add(btOne);
		nodes.add(btTwo);
		
		//you could also do:
		//nodes.addAll(btOne, btTwo);
		
		Scene scene = new Scene(pane, 300, 400);
		primaryStage.setTitle("Two Buttons in Stack Pane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	public static void main(String[] args)  {
		Application.launch(args);
	}



}
