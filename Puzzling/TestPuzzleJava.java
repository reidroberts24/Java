import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class TestPuzzleJava {
    
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	System.out.println(generator.getRandomLetter());
		System.out.println(generator.generatePassword());
		String[] newPasswordSet = generator.getNewPasswordSet(10); 
		System.out.println(Arrays.toString(newPasswordSet));
		String[] shuffledArray = generator.shuffleArray(newPasswordSet);
		System.out.println(Arrays.toString(shuffledArray));
	}
}
