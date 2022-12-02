package class_examples;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class EnlargeHandler implements EventHandler<ActionEvent> {
	private CirclePane circlePane;
	
	public EnlargeHandler(CirclePane circlePane) {
		this.circlePane = circlePane;
	}

	@Override
	public void handle(ActionEvent event) {
		this.circlePane.enlarge();
	}
}