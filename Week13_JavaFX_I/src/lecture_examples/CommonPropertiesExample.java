package lecture_examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CommonPropertiesExample extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a circle and set its properties
		Circle circle = new Circle();
		circle.setCenterX(250);
		circle.setCenterY(250);
		circle.setRadius(200);
//		circle.setStroke(Color.BLACK);
//		circle.setFill(Color.GREEN);
		
		String cssString = "-fx-stroke: crimson; -fx-fill: radial-gradient(focus-angle 45deg, focus-distance 20%, center 25% 25%, radius 50%, reflect, green, blue 75%, red); -fx-stroke-width: 10px;";
		circle.setStyle(cssString);
		

		// Create a pane to hold the circle 
		//The Regular Pane lays things out according to x, y coords.
		Pane pane = new Pane();
		pane.getChildren().add(circle);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("ShowCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}














	public static void main(String[] args) {
		Application.launch(args);

	}



}
