
public class Room implements Rentable {

	
	String description;
	double dailyRate;
	
//	Constructor
	public Room() {
		
	}
	
	public Room(String roomName, double dailyRate) {
		description = roomName;
		this.dailyRate = dailyRate;
	}


//	Methods
	
//	Method returns the description of the item.
	public String getDescription() {
		
		return description;
	}
	
//	Method returns the daily rate for renting the item
	public double getDailyRate() {
		
		return dailyRate;
	}
	
//	Method returns the amount due for renting the item for the a given number of days.
	public double getPrice(double days) {
		
		return dailyRate * days;
	}

}
