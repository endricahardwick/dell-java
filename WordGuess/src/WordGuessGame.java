import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {

	public static void main(String args[]) throws IOException {

		BufferedReader in = null;

//		Initialize Array
		ArrayList<String> listOfWords;
		listOfWords = new ArrayList<String>();

		System.out.println("Welcome to the game of Hangman!");

		try {

//			Read file line by line
			in = new BufferedReader(new FileReader("words_alpha.txt"));
			String line;

//			Add string to array list
			while ((line = in.readLine()) != null) {
				listOfWords.add(line);
			}

			Random rand = new Random();
			int indexToPick = rand.nextInt(listOfWords.size());
			String chosenWord = listOfWords.get(indexToPick);
			guessWord(chosenWord);

		} finally {
			// Close input and output streams
			if (in != null) {
				in.close();
			}
		}

	}

//	Method shows the player the word with all the letters "hidden"
//	And prompts the user to guess a letter. 
//	If the letter is part of the word, it will get filled in.
	public static void guessWord(String chosenWord) {

		Scanner reader = new Scanner(System.in);

		boolean wordGuessed = false;

		char[] filler = new char[chosenWord.length()];
		int chosenWordLength = chosenWord.length();
		int iterations = 0;

		while (iterations < chosenWordLength) {
			filler[iterations] = '-';
			iterations++;
		}
		System.out.println(filler);

		System.out.println("Guess a single lowercae character: ");

		while (!wordGuessed) {

// 			Get player's play from input
			String personGuess = reader.next();

//			Check If the player inputs a non-alphabetic character
//			notify the player that their input is invalid and prompt them to try again.
			boolean inAlphabet = true;
			inAlphabet = Character.isLetter(personGuess.charAt(0));

			if (!inAlphabet) {
				System.out.println("Not a valid entry. Try Again.\n" + "Guess a single lowercase character: ");
			} else

//				Check if inputs more than one character at a time
//				notify the player that their input is invalid and prompt them to try again.
			if (personGuess.length() != 1) {
				System.out.println("Not a valid entry. Try Again.\n" + "Guess a single lowercase character: ");
			} else

//			Check if character has already been guessed.
//			notify the player that their input is a duplicate and prompt them to try again.
			if (String.valueOf(filler).contains(personGuess + "")) {
				System.out.println(
						"Character has already been guessed. Try Again.\n" + "Guess a single lowercase character: ");
			} else

//			Check if character in chosen word and if found replace "-" with character
			if (chosenWord.contains(personGuess + "")) {
				for (int i = 0; i < chosenWordLength; i++) {
					if (chosenWord.charAt(i) == personGuess.charAt(0)) {
						filler[i] = personGuess.charAt(0);
					}
				}
//				notify the player that their input is valid and prompt them for another guess.
				System.out.println("Awesome!\n" + "Guess another single lowercase character: ");
			} else {
//				notify the player that their input is invalid and prompt them to try again.
				System.out.println("No Match Found. Try Again.\n" + "Guess a single lowercase character: ");
			}

//			Check if filler equals chosenWord
//			If word is guessed, notify the player by congradulating them. Game Over.
			if (chosenWord.equals(String.valueOf(filler))) {
				System.out.println();
				System.out.println("Congrats! You guessed the word. Game Over!");
				wordGuessed = true;

			}
			System.out.println(filler);
		}

		reader.close();
	}

}
