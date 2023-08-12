
public class Bat extends Mammal {
	
	public Bat() {
		energy = 300;
	}
	
	public boolean fly() {
		if (energy < 50) {
			System.out.println("The bat needs to rest before getting back to the skies.");
			return false;
		}
		
		energy -= 50;
		System.out.println("Take cover! The bat is flying!");
		return true;
	}
	
	public void eatHumans() {
		energy += 25;
		System.out.println("The bat just ate a citizen! He's getting ready to attack again!");
	}
	
	public boolean attackTown() {
		if (energy < 100) {
			System.out.println("We dodged a bullet. But it's only a matter of time before he tries attacking again.");
			return false;
		}
		energy -= 100;
		System.out.println("Get in the subways! We can't stop it!");
		return true;
	}
	
	
}
