
public class Gorilla extends Mammal {
	
	public boolean throwSomething() {
		if (energy < 5) {
			System.out.println("A gorilla tried to throw a rock but didn't have enough energy!");
			return false;
		}
		energy -= 5;
		System.out.println("A gorilla threw a rock!");
		return true;
	}
	
	public void eatBananas() {
		energy += 10;
		System.out.println("A gorilla ate some bananas and needs a nap now!");
	}
	
	public boolean climb() {
		if (energy < 10) {
			System.out.println("A gorilla tried to climb but fell because he was too tired!");
			return false;
		}
		
		energy -= 10;
		System.out.println("A gorilla climbed up a hill!");
		return true;
	}
}
