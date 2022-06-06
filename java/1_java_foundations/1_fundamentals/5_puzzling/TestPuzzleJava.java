public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava test = new PuzzleJava();

        System.out.println(test.getTenRolls());

        System.out.println(test.getRandomLetter());

        System.out.println(test.generatePassword());

        System.out.println(test.getNewPasswordSet(2));
        System.out.println(test.getNewPasswordSet(3));
        System.out.println(test.getNewPasswordSet(4));
    }
}