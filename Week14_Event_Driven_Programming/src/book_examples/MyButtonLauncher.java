package book_examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyButtonLauncher extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		MyButton mb1 = new MyButton("Button 1", 1);
		MyButton mb2 = new MyButton("Button 2", 2);
		
		MyButtonHandler mbh = new MyButtonHandler();
		
		mb1.setOnAction(mbh);
		mb2.setOnAction(mbh);
		
		HBox pane = new HBox();
		
		pane.getChildren().addAll(mb1, mb2);
		
		Scene scene = new Scene(pane);
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	

}
