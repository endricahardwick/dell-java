import java.util.ArrayList;

public class Dao {

//	Drives all the updates to the database. 
//	This class is usually called a DAO (Data Access Object).

//	For database Version 1, use an ArrayList to store the user's to-do items
	ArrayList<ToDoItem> listOfToDoItems;

//	Constructor Initialized
	public Dao() {
		listOfToDoItems = new ArrayList<ToDoItem>();
	}

//	gets & sets

	public ArrayList<ToDoItem> getListOfToDoItems() {
		return listOfToDoItems;
	}

	public void setListOfToDoItems(ArrayList<ToDoItem> listOfToDoItems) {
		this.listOfToDoItems = listOfToDoItems;
	}

// 	Methods

//	Method to update list
//	The user should be able to mark an item in their to-do list as complete
//	update ArrayList as they are added, completed, and deleted
	public void update(int id, boolean completed) {

		listOfToDoItems.get(id).setCompleted(completed);
		System.out.println("[Item updated to completed]");
	}

	// Method to add to the list
//	The user should be able to add an item to their list of to-do's
	public void add(ToDoItem description) {

		listOfToDoItems.add(description);
		System.out.println("[Item added]");
	}

// Method to delete from the list
//	The user should be able to delete an item from their list of to-do's
	public void delete(int id) {

		int index;

//		pass the user selected id into this method. 
//		loop through the items in the array to find index of item and when found delete.
		for (ToDoItem item : listOfToDoItems) {
			int itemId;
			itemId = item.getId();
			if (itemId == id) {
				index = listOfToDoItems.indexOf(item);
				listOfToDoItems.remove(index);
				break;
			}
		}
		System.out.println("[Item deleted]");

	}

// Method to list the list
//	The user should be able to list the current to-do items.
	public void list(String status) {

		String pstatus = "pending";
		String dstatus = "done";

		int longestDescription = 11;

//		set a length for the description title and check if description is longer than title.
//		This allows for flexibility of length for the description column
		for (ToDoItem entry : listOfToDoItems) {
			if (entry.getDescription().length() > longestDescription) {
				longestDescription = entry.getDescription().length();
			}
		}

//		set the header format
		String descriptionHeader = String.format("%" + longestDescription + "s", "Description");
		String descriptionUnderline = "";
		for (int i = 0; i < longestDescription; i++) {
			descriptionUnderline += "-";
		}

//		print header with set format
		System.out.println(" ID | " + descriptionHeader + " | Status");
		System.out.println("----+-" + descriptionUnderline + "-+-------");

		for (ToDoItem entry : listOfToDoItems) {
			String description = String.format("%-" + longestDescription + "s", entry.getDescription());

//			list only items that are pending.
			if (status.equals("pending")) {
				if (entry.getCompleted() == false) {
					String line = String.format(" %2s | %s | %s ", entry.getId(), description, status);
					System.out.println(line);
				}
			} else

//			list only items that have been done.
			if (status.equals("done")) {
				if (entry.getCompleted() != false) {
					String line = String.format(" %2s | %s | %s ", entry.getId(), description, status);
					System.out.println(line);
				}
			}

//			list all items, both completed and pending.
			if (status.equals("all")) {

				if (entry.getCompleted() == false) {
					pstatus = "pending";
					String line = String.format(" %2s | %s | %s ", entry.getId(), description, pstatus);
					System.out.println(line);
				}
				if (entry.getCompleted() != false) {
					dstatus = "done";
					String line = String.format(" %2s | %s | %s ", entry.getId(), description, dstatus);
					System.out.println(line);

				}
			}
		}
	}
}
