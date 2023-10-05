import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	//..
		// Write your other test cases here.
		//..
        System.out.println(generator.getRandomLetter());

        System.out.println(generator.generatePassword());

        System.out.println(generator.getNewPasswordSe(10));

        
        ArrayList<Object> input = new ArrayList<Object>(Arrays.asList("b", 12, 44, "f", "i", 1, 3, "d", "z", "w"));
        System.out.println(generator.shuffleArray(input));

	}
}