import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int roll = rand.nextInt(20) + 1;
            tenRolls.add(roll);
        }
        return tenRolls;
    }

    public char getRandomLetter() {
        char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Random rand = new Random();
        int index = rand.nextInt(25);
        return alphabet[index];
    }

    public String generatePassword() {
        String password = new String();
        for (int i = 0; i < 8; i++) {
            char newLetter = getRandomLetter();
            password = password + newLetter;
        }
        return password;
    }   

    public String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }

    public String[] shuffleArray(String[] inputArray) {
        int length = inputArray.length;
        Random rand = new Random();

        for (int i = 0; i < inputArray.length; i++) {
            int swapIndex = rand.nextInt(inputArray.length);
            String temp = inputArray[i];

            inputArray[i] = inputArray[swapIndex];
            inputArray[swapIndex] = temp;

        }
        return inputArray;
    }
}
