package book_examples;

public class TV {
	private int channel;
	private int volumeLevel;
	private boolean on;

	public TV() {
		this.channel = 1; 		// Default channel is 1
		this.volumeLevel = 1;	// Default volume level is 1
		this.on = false;			// By default TV is off
	}

	public void turnOn() {
		this.on = true;
	}

	public void turnOff() {
		this.on = false;
	}

	public void setChannel(int newChannel) {
		if (this.on && newChannel >= 1 && newChannel <= 120) {
			this.channel = newChannel;
		}
	}

	public int getChannel() {
		return this.channel;
	}


	public void setVolume(int newVolumeLevel) {
		if (this.on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			this.volumeLevel = newVolumeLevel;
		}
	}

	public int getVolume() {
		return this.volumeLevel;
	}

	public void channelUp() {
		if (this.on && this.channel < 120) {
			this.channel++;
		}
	}

	public void channelDown() {
		if (this.on && this.channel > 1) {
			this.channel--;
		}
	}

	public void volumeUp() {
		if (this.on && this.volumeLevel < 7) {
			this.volumeLevel++;
		}
	}

	public void volumeDown() {
		if (this.on && this.volumeLevel > 1) {
			this.volumeLevel--;
		}
	}


}

