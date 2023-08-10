
public class MammalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// testing both bat and gorilla classes in this one test file
	
		//GORILLA TEST
		Gorilla gorilla1 = new Gorilla();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		
		gorilla1.climb();
		
		System.out.printf("Gorilla's energy level: %d%n", gorilla1.energy);
		
		//BAT TEST
		Bat bat1 = new Bat();
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		
		bat1.eatHumans();
		bat1.eatHumans();
		
		bat1.fly();
		bat1.fly();
		System.out.printf("Giant Bat's energy level: %d%n", bat1.energy);
	
	
	
	}

}
