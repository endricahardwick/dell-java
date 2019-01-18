import java.util.Random;
import java.util.Scanner;

public class RpsExceptions {

	public static void main(String[] args) {

		// User's play -- "R", "P", or "S"
		String personPlay;

		// Computer's play -- "R", "P", or "S"
		String computerPlay = "";

		// Randomly generated number used to determine computer's play
		int computerInt;

		// boolean used to check for exceptions
		boolean invalid = true;

		Scanner reader = new Scanner(System.in);
		Random randNumGenerator = new Random();

		System.out.println("Hello, let's play Rock, Paper, Scissors!\n" + "Please enter a move.\n"
				+ "Rock = R, Paper= P, and Scissors = S.");

		System.out.println();

		// Generate computer's play (0,1,2)
		computerInt = randNumGenerator.nextInt(3) + 1;

		// Translate computer's randomly generated play to string
		if (computerInt == 1)
			computerPlay = "R";
		else if (computerInt == 2)
			computerPlay = "P";
		else if (computerInt == 3)
			computerPlay = "S";

		while (invalid) {
			try {
				// Get player's play from input
				System.out.println("Enter your play: ");
				personPlay = reader.next();

				// Make player's play uppercase
				personPlay = personPlay.toUpperCase();
				writePersonPlay(personPlay);
				checkUserInput(personPlay);
				writeComputerPlay(computerPlay);
				checkForWin(personPlay, computerPlay);
				invalid = false;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		reader.close();
	}

	public static void checkUserInput(String personPlay) {

		// Ask User to provide a valid entry
		if (!(personPlay.equals("R") || personPlay.equals("P") || personPlay.equals("S"))) {
		throw new IllegalArgumentException("Please enter a valid move.\n" + "Rock = R, Paper= P, and Scissors = S.\n");
		}
	}

	public static void writePersonPlay(String personPlay) {

		// Print Player's play
		System.out.println();
		System.out.println("Your play is: " + personPlay);
		System.out.println();
	}

	public static void writeComputerPlay(String computerPlay) {

		// Print computer's play
		System.out.println("Computer play is: " + computerPlay);
		System.out.println();

	}

	public static void checkForWin(String personPlay, String computerPlay) {

		// See who won
		if (personPlay.equals(computerPlay))
			System.out.println("It's a tie!");
		else if ((personPlay.equals("R")) && (computerPlay.equals("S")))
			System.out.println("Rock crushes scissors. You win!!");
		else if ((personPlay.equals("R")) && (computerPlay.equals("P")))
			System.out.println("Paper eats rock. You lose!!");
		else if ((personPlay.equals("P")) && (computerPlay.equals("S")))
			System.out.println("Scissor cuts paper. You lose!!");
		else if ((personPlay.equals("P")) && (computerPlay.equals("R")))
			System.out.println("Paper eats rock. You win!!");
		else if ((personPlay.equals("S")) && (computerPlay.equals("P")))
			System.out.println("Scissor cuts paper. You win!!");
		else if ((personPlay.equals("S")) && (computerPlay.equals("R")))
			System.out.println("Rock breaks scissors. You lose!!");
		else
			System.out.println("Invalid user input.");

	}

}
