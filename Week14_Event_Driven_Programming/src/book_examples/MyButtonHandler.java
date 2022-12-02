package book_examples;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyButtonHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {
		if (e.getSource() instanceof MyButton) {
			MyButton eventSource = (MyButton)e.getSource();
				
			System.out.println("Button " + eventSource.getButtonNumber() + " was pressed.");
		}	
	}

}
