
public abstract class Vehicle {

	public String licenseNumber;
	public String make;
	public String model;
	public String price;
	
	
//	Constructor empty
	public Vehicle() {
	}
	
	
//	Constructor Initialized
	public Vehicle(String vehicleLC, String vehicleMake, String vehicleModel, String vehiclePrice) {

		this.licenseNumber = vehicleLC;
		this.make = vehicleMake;
		this.model = vehicleModel;
		this.price = vehiclePrice;
		
	}
	
	
//	gets/sets initiated


	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicense(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
//	method to print a description of the vehicle, 
//	including license number, make, model, and price
	
	public abstract void printDescription();
}
