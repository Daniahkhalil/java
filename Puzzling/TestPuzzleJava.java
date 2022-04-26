import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
        char randomChars = generator.getRandomLetter();
        System.out.println(randomChars);
		String pass=generator.generatePassword();
        System.out.println(pass);
        ArrayList<Character> randomAchar = generator.getNewPasswordSet(8);
		System.out.println(randomAchar);
    	//..
		// Write your other test cases here.
		//..
	}
}