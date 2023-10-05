import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {
    
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        for ( int i=0; i <10; i ++){
            Random randMachine = new Random();
            randomArray.add(randMachine.nextInt(21));
        }
        return randomArray;
    }

    public char getRandomLetter(){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random randMachine = new Random();
        int index = randMachine.nextInt(21);
        char letter = alphabet[index];
        return letter;
    }

    public String generatePassword(){
        ArrayList<String> randomLetterArray = new ArrayList<String>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i =0; i <8; i++){
            Random randMachine = new Random();
            int index = randMachine.nextInt(21);
            String letter = Character.toString(alphabet[index]);
            randomLetterArray.add(letter);  
        }
        StringBuilder joinedLetter = new StringBuilder();
        for (int i =0; i < randomLetterArray.size(); i++){
            joinedLetter.append(randomLetterArray.get(i));
        }
        String password = joinedLetter.toString();
        return password;
    }

    public ArrayList<String> getNewPasswordSe(int length){
        ArrayList<String> randomLetterArray = new ArrayList<String>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i =0; i <length; i++){
            Random randMachine = new Random();
            int index = randMachine.nextInt(21);
            String letter = Character.toString(alphabet[index]);
            randomLetterArray.add(letter);  
        }
        // StringBuilder joinedLetter = new StringBuilder();
        // for (int i =0; i < randomLetterArray.size(); i++){
        //     joinedLetter.append(randomLetterArray.get(i));
        // }
        // String password = joinedLetter.toString();
        return randomLetterArray;
    }

    public ArrayList<Object> shuffleArray(ArrayList<Object> randomArray){
        Random randMachine = new Random();
        System.out.println(randomArray);
        for ( int i =0; i < randomArray.size(); i++ ){
            int index = randMachine.nextInt(randomArray.size());
            Object temp = randomArray.get(i);
            randomArray.set(i, randomArray.get(index));
            randomArray.set(index, temp);
        }
        return randomArray;
    }

}
