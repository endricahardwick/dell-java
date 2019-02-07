
public class Car extends Vehicle {

	public static String[] typeOptions = {"coupe", "hatchback", "sedan"};
//	public enum CarType {coupe, hatchback, sedan};
	public String type;
	public String numberOfDoors;
	
//	Constructor empty
	public Car() {
	}
	
	
//	Constructor Initialized
	public Car(String vehicleLC, String vehicleMake, String vehicleModel, 
			String vehiclePrice, String type, String carDoors) {
		super(vehicleLC, vehicleMake, vehicleModel, vehiclePrice);
		this.type = type;
		this.type = type;
		this.numberOfDoors = carDoors;
	}
	
	
//	gets and sets
	

//	public static CarType getTypeOptions() {
//		return typeOptions;
//	}
//
//	public static void setTypeOptions(String[] typeOptions) {
//		Car.typeOptions = typeOptions;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}

	public String getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(String numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
//	method to print a description of the truck, 
//	including license number, make, model, and price
	public void printDescription() {
		System.out.println(getLicenseNumber() + " " + getMake() + " " + getModel() + " " + getPrice() + " " + type + " "  + numberOfDoors);
	}
	
}
