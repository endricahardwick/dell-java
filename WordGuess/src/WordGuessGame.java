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
			char personGuess = reader.next().charAt(0);
			
			
//			Check If the player inputs a non-alphabetic character
//			notify the player that their input is invalid and prompt them to try again.
			boolean inAlphabet = true;
//			boolean test = false;
			inAlphabet = Character.isLetter(personGuess);


			if (!inAlphabet) {
				System.out.println("Not a valid entry. Try Again.\n" + "Guess a single lowercase character: ");
			} else

				
//			Check if inputs more than one character at a time ???? 
//			I have no clue on how to do this....several hours spent googling with no luck...
//			Tried below code with help from class tutor and no luck either...
				
//			test = reader.hasNext();
//			System.out.println(test);
//				
//			if (reader.hasNext()) {
//				System.out.println("Not a valid entry. Try Again.\n" + "Guess a single lowercase character: ");
//			}

				
//			Check if character in chosen word and if found replace "-" with character
			if (chosenWord.contains(personGuess + "")) {
				for (int i = 0; i < chosenWordLength; i++) {
					if (chosenWord.charAt(i) == personGuess) {
						filler[i] = personGuess;
					}
				}
			} else {
				System.out.println("No Match Found. Try Again.\n" + "Guess a single lowercase character: ");
			}

//			Check if filler equals chosenWord
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
