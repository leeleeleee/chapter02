package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	public TV(int channel, int volume, boolean power){
		this.channel = channel;
		this.volume = volume;
		this.power =power;
	}
	public void power(boolean on) {
		if(on){
			power = true;
		} else {
			power = false;
		}
	}
	public void channel( int channel ) {
		this.channel=channel;
		if(channel<1){
			this.channel =255;
		}
		if(channel>255) {
			channel = 1;
		}
	}
	public void channel ( boolean up ) {
		if(up){
			channel++;
		} else {
			channel--;
		}
	}
	public void volume ( int volume ) {
		this.volume=volume;
	}
	public void volume ( boolean up ) {
		if(up){
			volume++;
		} else {
			volume--;
		}
	}
	public void status() {
		System.out.println(channel+":"+volume+":"+(power ? "on" : "off"));
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
}
