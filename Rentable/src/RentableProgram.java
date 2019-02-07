import java.util.ArrayList;
import java.util.Scanner;

public class RentableProgram {

	public static void main(String[] args) {
		
		String days;

		ArrayList<Rentable> listOfRentables;
		listOfRentables = new ArrayList<Rentable>();

//		Instantiate a few instances of each of the classes (Room, Condo, Tool)

//		Instantiate Rooms
		Room room1 = new Room("Room 777", 105);
		Room room2 = new Room("Room 111", 160);

//		Instantiate Condos
		Condo condo1 = new Condo("Paradise Condo", 700);
		Condo condo2 = new Condo("Sea Side Condo", 800);

//		Instantiate Tools
		Tool tool1 = new Tool("Jack Hammer", 15);
		Tool tool2 = new Tool("Pressure Washer", 20);

//		add them to an array of Rentable objects.
		listOfRentables.add(room1);
		listOfRentables.add(room2);
		listOfRentables.add(condo1);
		listOfRentables.add(condo2);
		listOfRentables.add(tool1);
		listOfRentables.add(tool2);

//		Loop through the array, and print out the description and the daily rate for each item.
		for (int i = 0; i < listOfRentables.size(); i++) {
			System.out.println("Description: " + listOfRentables.get(i).getDescription() + "     " + "Daily Rate: " + listOfRentables.get(i).getDailyRate());
		}
		System.out.println();
		
//		Ask the user for a number of days to generate the final price for each of the items in the array.


		Scanner reader = new Scanner(System.in);

		System.out.println("Hello");

		System.out.println();

		// Get user's number of days from input
		System.out.println("Enter your number of days: ");
		days = reader.next();
		reader.close();
		
		double converted = Double.parseDouble(days);
		
		room1.getPrice(converted);
		System.out.println("Description: " + room1.description + "     " + "Final Price: " + room1.getPrice(converted));
		
		room2.getPrice(converted);
		System.out.println("Description: " + room2.description + "     " + "Final Price: " + room2.getPrice(converted));
		
		condo1.getPrice(converted);
		System.out.println("Description: " + condo1.description + "     " + "Final Price: " + condo1.getPrice(converted));
		
		condo2.getPrice(converted);
		System.out.println("Description: " + condo2.description + "     " + "Final Price: " + condo2.getPrice(converted));
		
		tool1.getPrice(converted);
		System.out.println("Description: " + tool1.description + "      " + "Final Price: " + tool1.getPrice(converted));
		
		tool2.getPrice(converted);
		System.out.println("Description: " + tool1.description + "      " + "Final Price: " + tool2.getPrice(converted));
	}

}
