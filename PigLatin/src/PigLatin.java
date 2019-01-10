import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// User's string
		String stringEntered;

		Scanner reader = new Scanner(System.in);

		System.out.println("Hello, this is your Pig Latin translator:");

		System.out.println();

		// Get user's string from input
		System.out.println("Enter your string: ");
		stringEntered = reader.next();

		// Make player's play uppercase
		stringEntered = stringEntered.toUpperCase();
		reader.close();

		writeUserString(stringEntered);
		translateString(stringEntered);

	}

	public static void writeUserString(String stringEntered) {

		// Print Player's play
		System.out.println("Your string is: " + stringEntered);
	}

	public static void translateString(String stringEntered) {

		int indexChar = 0;
		char firstChar = stringEntered.charAt(0);
		char nextChar = stringEntered.charAt(1);

		// If a word starts with a vowel, add "yay" to the end. (elephant ->
		// elephantyay)
		if ((firstChar == ('A')) || (firstChar == ('E')) || (firstChar == ('I')) || (firstChar == ('O'))
				|| (firstChar == ('U'))) {
			System.out.println("Pig Latin translation is: " + stringEntered + "YAY");

		// If a word starts with a consonant, and has a vowel in the word, move all the
		// letters before the initial vowel to the end, then add "ay". (pig -> igpay)
		// If a word does not have any vowels, then add "ay". (tsktsk -> tsktskay)
		} else {
//			System.out.println("String starts with a consonant.");
			for (int i = 1; i < stringEntered.length(); i++) {
//				System.out.println("Value of i:" + i);
				nextChar = stringEntered.charAt(i);
				if ((nextChar == ('A')) || (nextChar == ('E')) || (nextChar == ('I')) || (nextChar == ('O'))
						|| (nextChar == ('U'))) {
					indexChar = i;
					break;
				}
			}
//			System.out.println("Value of indexChar:" + indexChar);
			System.out.println("Pig Latin translation is: " + stringEntered.substring(indexChar)
					+ stringEntered.substring(0, indexChar) + "AY");

		}
	}
}
