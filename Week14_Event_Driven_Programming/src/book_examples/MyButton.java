package book_examples;

import javafx.scene.control.Button;

public class MyButton extends Button{
	private int buttonNumber = 0;
	
	
	public MyButton(String text, int buttonNumber) {
		super(text);
		this.buttonNumber = buttonNumber;
	}


	public int getButtonNumber() {
		return buttonNumber;
	}
	
	
	
	
}
