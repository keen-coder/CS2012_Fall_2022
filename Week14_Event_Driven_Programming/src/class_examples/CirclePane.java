package class_examples;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirclePane extends Pane {
	private Circle circle = new Circle(50); 

	public CirclePane(int width, int height) {
		super.getChildren().add(this.circle);
		this.circle.setStroke(Color.BLACK);
		this.circle.setFill(Color.WHITE);
		this.circle.setCenterX(width / 2);
		this.circle.setCenterY(height / 2);
	}
	
	public Circle getCircle() {
		return this.circle;
	}

	public void enlarge() {
		this.circle.setRadius(this.circle.getRadius() + 2);
	}
	
	
	//(condition) ? option1 : option2
	public void shrink() {
		this.circle.setRadius(this.circle.getRadius() > 2 ? this.circle.getRadius() - 2 : this.circle.getRadius());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
