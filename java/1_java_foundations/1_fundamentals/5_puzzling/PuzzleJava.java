import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    Random randomMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randomArray = new ArrayList<Integer>(); 
        for (int i = 0; i < 10; i++) {
            int randomNumber = randomMachine.nextInt(21);
            randomArray.add(randomNumber);
        }
        return randomArray;
    }

    public char getRandomLetter() {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int randomIndex = randomMachine.nextInt(26); 
        return alphabets[randomIndex];
    }

    public String generatePassword() {
        String password = "";

        for (int i = 0; i < 8; i++) {
            String randomLetter = Character.toString(getRandomLetter());
            password += randomLetter;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int howMany) {
        ArrayList<String> passwords = new ArrayList<String>(); 
        for (int i = 0; i < howMany; i++) {
            passwords.add(generatePassword());
        }
        return passwords;
    }
}