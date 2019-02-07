
public class Truck extends Vehicle {

	public String bedSize;
	
//	Constructor empty
	public Truck() {
	}
	
	
//	Constructor Initialized
	public Truck(String truckBedSize,String vehicleLC, String vehicleMake, String vehicleModel, String vehiclePrice) {
		super(vehicleLC, vehicleMake, vehicleModel, vehiclePrice);
		bedSize = truckBedSize;
		
	}
	
//	gets and sets
	public String getBedSize() {
		return bedSize;
	}


	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}
	
	
	
//	method to print a description of the truck, 
//	including license number, make, model, and price
	public void printDescription() {
		System.out.println(bedSize + " " + getLicenseNumber() + " " + getMake() + " " + getModel() + " " + getPrice() + " ");
	}


}
