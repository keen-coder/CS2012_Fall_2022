package lecture_examples;

public class MyColor {
	private String colorName;

	public MyColor(String colorName) {
		super();
		this.colorName = colorName;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	@Override
	public String toString() {
		return "MyColor [colorName=" + colorName + "]";
	}
	
	
	
}
