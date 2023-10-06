
public class Device {

	private int battery;
	
	public Device() {
		this.battery = 100;
	}

	public int getBatteryStatus() {
		return battery;
	}

	public void setBatteryStatus(int newBattery) {
		this.battery = newBattery;
}
}
