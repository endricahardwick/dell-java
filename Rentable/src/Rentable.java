
public interface Rentable {

//	Methods
	
//	Method returns the description of the item.
	String getDescription();
	
//	Method returns the daily rate for renting the item
	double getDailyRate();
	
//	Method returns the amount due for renting the item for the a given number of days.
	double getPrice(double days); 
	
}
