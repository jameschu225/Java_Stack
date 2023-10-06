
public class Phone extends Device{

	
	public void makeCall() {
		super.setBatteryStatus(super.getBatteryStatus() - 5);
		if (super.getBatteryStatus()<10) {
			System.out.print("battery critical");
		}
	}
	
	public void playGame() {
		if (super.getBatteryStatus()>=25) {
			super.setBatteryStatus(super.getBatteryStatus() - 20);
			if (super.getBatteryStatus()<10) {
				System.out.print("battery critical");
			}
		} else {
			System.out.print("Battery below 25, can't play");
		}	
	}
	
	public void charge() {
		super.setBatteryStatus(super.getBatteryStatus() + 50);
	}

}
