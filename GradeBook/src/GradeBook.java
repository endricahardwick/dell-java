import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class GradeBook {

	public static void main(String[] args) {

		// Create a HashMap to store names and grades
		// Key: name, Value: grades
		HashMap<String, String> grades = new HashMap<String, String>();

		// Ask user for number of students
		Scanner reader = new Scanner(System.in);
		System.out.println("Hello!");
		System.out.println("Please enter the number of students:");
		int numberOfStudents = Integer.parseInt(reader.nextLine());

		System.out.println("You entered: " + numberOfStudents);

		// Ask user for students name and grades
		for (int i = 0; i < numberOfStudents; i++) {

			System.out.println();
			System.out.println("Please enter student's " + (i + 1) + " name:");
			String studentName = reader.nextLine();

			System.out.println();
			System.out.println("Please enter student's " + (i + 1) + " grades separated by commas:");
			String studentGrades = reader.nextLine();

			// Add user's name and grades to HashMap
			grades.put(studentName, studentGrades);

		}
		reader.close();

		// User is done adding info, print out student average

		// Get the list of names in the HashMap
		ArrayList<String> studentName = new ArrayList<String>(grades.keySet());

		// For each name, look up their grades and print out average
		for (int j = 0; j < studentName.size(); j++) {
			String currentName = studentName.get(j);
			String listGrades = grades.get(currentName);

			System.out.println();
			System.out.println(currentName + "'s grades: ");
			writeAverage(listGrades);
		}
	}

	public static void writeAverage(String listGrades) {

//		int sum = 0;
//		int average = 0;
//		Changed variable from int to Double to provide decimal place values
		Double sum = 0.0;
		Double average = 0.0;

		// The split method splits up the string based on the position of the commas.
		// The substrings are placed into an array.
		String[] gradeListArray = listGrades.split(",");
		int[] converted = new int[gradeListArray.length];

		for (int i = 0; i < converted.length; i++) {
			converted[i] = Integer.parseInt(gradeListArray[i]);
			System.out.println(gradeListArray[i]);
			sum = sum + converted[i];
		}

		// Calculate average
		average = sum / converted.length;
		System.out.println("The average is: " + average);
	}
}
