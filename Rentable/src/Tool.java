
public class Tool implements Rentable {
		 
	String description;
	double dailyRate;
	double hourlyRate;
	
//	Constructor
	public Tool() {
	}
	
	public Tool(String toolName, double hourlyRate) {
		description = toolName;
		this.hourlyRate = hourlyRate;
	}
	
//	Methods
	
//	Method returns the description of the item.
	public String getDescription() {
		
		return description;
	}
	
//	Method returns the daily rate for renting the item
	public double getDailyRate() {
		
		return hourlyRate*24;
	}
	
//	Method returns the amount due for renting the item for the a given number of days.
	public double getPrice(double days) {
		
		dailyRate = hourlyRate*7;
		return dailyRate * days;
	}

}
