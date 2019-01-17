import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		// User's string
		String numbersEntered;

		Scanner reader = new Scanner(System.in);

		System.out.println("Hello");

		System.out.println();

		// Get user's numbers from input
		System.out.println("Enter your numbers separated by commas: ");
		numbersEntered = reader.next();
		reader.close();

		writeUserNumbers(numbersEntered);
	}

	public static void writeUserNumbers(String numbersEntered) {

		// The split method splits up the string based on the position of the commas.
		// The substrings are placed into an array.
		String[] numberListArray = numbersEntered.split(",");
		int[] converted = new int[numberListArray.length];

		// Print user's numbers
		System.out.println();	
		System.out.println("Your numbers are:");
		// Loop through shopping list array
		// convert string to number
		// print each item
		for (int i = 0; i < converted.length; i++) {
			converted[i] = Integer.parseInt(numberListArray[i]);
			System.out.println(numberListArray[i]);
		}

		// Find and write minimum number
		writeMinNumber(converted);
		writeMaxNumber(converted);
		writeElementNumber(converted);
		writeAverage(converted);
		writeSum(converted);
	}

	public static void writeMinNumber(int[] converted) {

		int currentMin = converted[0];
		
		for (int i = 1; i < converted.length; i++) {
			if (converted[i] < currentMin) {
				currentMin = converted [i];
	
				break;
			}

		}
		System.out.println();	
		System.out.println("The minimum number is: " + currentMin);
	}
	
	public static void writeMaxNumber(int[] converted) {

		int currentMax = converted[0];
		
		for (int i = 1; i < converted.length; i++) {
			if (converted[i] > currentMax) {
				currentMax = converted [i];
	
				break;
			}

		}
		System.out.println();	
		System.out.println("The maximum number is: " + currentMax);
	}
	
	public static void writeElementNumber(int[] converted) {

		int elements = converted.length;

		System.out.println();	
		System.out.println("The number of elements is: " + elements);
	}
	
	public static void writeAverage(int[] converted) {

		int sum = 0;
		int average = 0;
		
		for (int i = 0; i < converted.length; i++) {
				sum = sum + converted[i];
		}
		
		average = sum/converted.length;

		System.out.println();	
		System.out.println("The average is: " + average);
	}
	
	public static void writeSum(int[] converted) {

		int sum = 0;
		
		for (int i = 0; i < converted.length; i++) {
				sum = sum + converted[i];
		}

		System.out.println();	
		System.out.println("The sum is: " + sum);
	}

}
