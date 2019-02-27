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


		listOfToDoItems.remove(id);
		System.out.println("[Item deleted]");
	}

// Method to list the list
//	The user should be able to list the current to-do items.
	public void list(String status) {

		String pstatus = "pending";
		String dstatus = "done";

		System.out.println("in List Method");

		System.out.println(" ID | " + " Description | " + " Status");
		System.out.println("----+-" + "-------------+-" + "--------");

		for (int i = 0; i < listOfToDoItems.size(); i++) {
			
//			list only items that are pending.
			if (status.equals("pending")) {
				if (listOfToDoItems.get(i).getCompleted() == false) {
					System.out.println("  " + listOfToDoItems.get(i).getId() + " | "
							+ listOfToDoItems.get(i).getDescription() + " | " + status);
				}
			} else

//			list only items that have been done.
			if (status.equals("done")) {
				if (listOfToDoItems.get(i).getCompleted() != false) {
					System.out.println("  " + listOfToDoItems.get(i).getId() + " | "
							+ listOfToDoItems.get(i).getDescription() + " | " + status);

				}
			}

//			list all items, both completed and pending.
			if (status.equals("all")) {
				for (i = 0; i < listOfToDoItems.size(); i++) {
					if (listOfToDoItems.get(i).getCompleted() == false) {
						pstatus = "pending";
						System.out.println("  " + listOfToDoItems.get(i).getId() + " | "
								+ listOfToDoItems.get(i).getDescription() + " | " + pstatus);
					}
					if (listOfToDoItems.get(i).getCompleted() != false) {
						dstatus = "done";
						System.out.println("  " + listOfToDoItems.get(i).getId() + " | "
								+ listOfToDoItems.get(i).getDescription() + " | " + dstatus);

					}
				}
			}
		}
	}

}
