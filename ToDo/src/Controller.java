import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		// handles user input and acts as the "glue" between the DAO class and the user.

		Scanner reader = new Scanner(System.in);
		Dao myDao = new Dao();

		boolean quit = false;
		int myId = 0;
		boolean myCompleted = false;
		String status;

		System.out.println("Enter help to view the available functions:");

		while (!quit) {

			String personEntry = reader.next();

// 			Make person entry lower case 
			personEntry = personEntry.toLowerCase();

//			User enters help: list available functions
			if (personEntry.contains("help")) {
				System.out.println();
				System.out.println("Available Functions");
				System.out.println("add: to add an item");
				System.out.println("delete: to delete an item");
				System.out.println("completed: the item to mark as done");
				System.out.println("list pending: to list the pending items");
				System.out.println("list done: to list the done items");
				System.out.println("list all: to list all items");
				System.out.println("help: display available functions");
				System.out.println("quit: to exit");

			} else

//			User enters add: add item to array list
			if (personEntry.contains("add")) {
				System.out.println("Enter a description:");

				String myDescription = reader.next();
//				Make person entry lower case 
				myDescription = myDescription.toLowerCase();
				myDao.add(new ToDoItem(myId++, myDescription, myCompleted));

			} else

//			User enters delete: delete item from array list
			if (personEntry.contains("delete")) {
				System.out.println("Enter an item id:");

				int id = reader.nextInt();
				myDao.delete(id);
				
			} else

//			User enters completed: the item to mark as done
			if (personEntry.contains("completed")) {
				System.out.println("Enter an item id:");

				int id = reader.nextInt();
				myCompleted = true;
				myDao.update(id, myCompleted);

			} else

//			User enters list pending: to list the pending items
			if (personEntry.contains("pending")) {

				status = "pending";
				myDao.list(status);

			} else

//			User enters list done: to list the done items
			if (personEntry.contains("done")) {

				status = "done";
				myDao.list(status);

			} else

//			User enters list all: to list the all items
			if (personEntry.contains("all")) {

				status = "all";
				myDao.list(status);

			} else

//			User enters list quit: to exit program
			if (personEntry.contains("quit")) {
				System.out.println("Bye! Have a productive day.");
				quit = true;
			}

		}

		reader.close();
	}

}
