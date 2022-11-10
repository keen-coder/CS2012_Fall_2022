package lecture_examples;

public class VideoGame {
	private String title;
	private double price;
	private int peakPlayers;
	
	public VideoGame(String title, double price, int peakPlayers) {
		this.title = title;
		this.price = price;
		this.peakPlayers = peakPlayers;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getPeakPlayers() {
		return peakPlayers;
	}

	@Override
	public String toString() {
		return "{" + this.title + ", " + this.price + ", " + peakPlayers + "}";
	}
}