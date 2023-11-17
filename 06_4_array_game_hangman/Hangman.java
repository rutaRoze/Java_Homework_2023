import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean wantsToGuessWord;
        do {
            String wordToGuess = getRandomWord();
            String wordAfterGuess = convertWordToStars(wordToGuess);
            String wordBeforeGuess;
            int missedGuessesCount = 0;

            while (!wordToGuess.equals(wordAfterGuess)) {
                System.out.print("Guess a letter in word ");
                System.out.print(wordAfterGuess);
                System.out.print(" > ");
                wordBeforeGuess = wordAfterGuess;
                char letterGuess = scanner.next().charAt(0);
                wordAfterGuess = displayGuessedWordLetters(wordAfterGuess, wordToGuess, letterGuess);
                missedGuessesCount += countMissedGuesses(wordBeforeGuess, wordAfterGuess);
            }

            System.out.println("The word is " + wordAfterGuess + ". You missed " + missedGuessesCount + " time");
            System.out.println("Do you want to guess another word? Enter y or n");
            String answer = scanner.next();
            wantsToGuessWord = checkIfPlayerWantsPlay(answer);

        } while (wantsToGuessWord);
    }

    public static String[] createWordList() {

        String[] words = {"friendship", "intention", "investment", "expression", "week",
                "school", "program", "decision", "apple", "love",};

        return words;
    }

    public static String getRandomWord() {

        String[] wordList = createWordList();
        String word = wordList[(int) (Math.random() * wordList.length)];

        return word;
    }

    public static String convertWordToStars(String word) {

        String wordInStars = "";
        for (int i = 1; i <= word.length(); i++) {
            wordInStars = wordInStars + "*";
        }
        return wordInStars;
    }

    public static String displayGuessedWordLetters(String changedWord, String word, char letter) {

        String guessedLetters = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedLetters += letter;
            } else {
                guessedLetters += changedWord.charAt(i);
            }
        }

        return guessedLetters;
    }

    public static int countMissedGuesses(String wordBeforeGuess, String wordAfterGuess) {

        int countOfMisses = 0;
        if (wordBeforeGuess.equals(wordAfterGuess)) {
            countOfMisses++;
        }

        return countOfMisses;
    }

    public static boolean checkIfPlayerWantsPlay(String answer) {

        boolean wantToGuessWord = false;
        if (answer.equals("y")) {
            wantToGuessWord = true;
        }

        return wantToGuessWord;
    }
}
