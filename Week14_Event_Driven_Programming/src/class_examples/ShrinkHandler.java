package class_examples;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ShrinkHandler implements EventHandler<ActionEvent> {
	private CirclePane circlePane;
	
	
	public ShrinkHandler(CirclePane circlePane) {
		this.circlePane = circlePane;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		this.circlePane.shrink();
	}

}
