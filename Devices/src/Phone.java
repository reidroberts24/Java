
public class Phone extends Device{
	
	private void checkBatteryCritical() {
		if (battery <= 10) {
			System.out.println("Battery critical! Please charge your phone!");
		}
	}
	
	public int makeCall() {
		if (battery == 0) {
			System.out.println("Can't make a call, phone is dead!");
			return battery;
		}
		
		checkBatteryCritical();
		
		if (battery <= 5) {
			battery = 0;
			System.out.println("Phone died during a call!");
			return battery;
		}
		
		battery -= 5;
		System.out.printf("Battery remaining: %d%n", battery);
		return battery;
	}
	
	public int playGame() {
		if (battery == 0) {
			System.out.println("Can't play a game, phone is dead!");
			return battery;
		}

		checkBatteryCritical();
		
		if (battery <= 25) {
			System.out.println("You must charge your phone above 25% before you can play a game!");
			return battery;
		}
		battery -= 20;
		System.out.printf("Battery remaining: %d%n", battery);
		return battery;
	}
	
	public int charge() {
		battery += 50;
		if (battery > 100) {
			battery = 100;
		}
		System.out.println("Phone battery went up by 50%!");
		System.out.printf("Battery remaining: %d%n", battery);
		return battery;
	}
}
