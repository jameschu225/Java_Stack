
public class TestDevice {
	
	public static void main(String[] args) {

		Phone phone1 = new Phone();
		
		phone1.makeCall();
		phone1.makeCall();
		phone1.makeCall();

		phone1.playGame();
		phone1.playGame();

		phone1.charge();
		
		System.out.print(phone1.getBatteryStatus());
	}
}
