
public class Device {
	protected int battery = 100;
	
	public void status() {
		if (this.battery == 0) {
			System.out.println("Device is dead.");
		} else {
			System.out.println("Device still has battery left.");
		}
	}
}
