
public class Condo implements Rentable {

	String description;
	double dailyRate;
	double weeklyRate;
	
//	Constructor
	public Condo() {
		
	}
	
	public Condo(String condoName, double weeklyRate) {
		description = condoName;
		this.weeklyRate = weeklyRate;
	}
	
	
//	Methods
	
//	Method returns the description of the item.
	public String getDescription() {
		
		return description;
	}
	
//	Method returns the daily rate for renting the item
	public double getDailyRate() {
		
		return weeklyRate/7;
	}
	
//	Method returns the amount due for renting the item for the a given number of days.
	public double getPrice(double days) {
		
		dailyRate = weeklyRate/7;
		return dailyRate * days;
	}
}
