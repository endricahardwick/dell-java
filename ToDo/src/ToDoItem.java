
public class ToDoItem {

//	Defines a ToDoItem
	
	private int id;
	private String description;
	private Boolean completed;
	
//	Constructor empty
	public ToDoItem() {
	}
	
	
//	Constructor Initialized
	public ToDoItem(int myId, String myDescription, Boolean myCompleted) {
		this.id = myId;
		this.description = myDescription;
		this.completed = myCompleted;
	}


//	gets & sets
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Boolean getCompleted() {
		return completed;
	}


	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	
}
