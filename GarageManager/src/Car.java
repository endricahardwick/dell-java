
public class Car {

//  Attributes
	public String color;
	public String license;
	public String make;
	public String model;

//	Constructor empty
	public Car() {

	}
	
//	Constructor initialized
	public Car(String carColor, String carLicense, String carMake, String carModel) {
		
		color = carColor;
		license = carLicense;
		make = carMake;
		model = carModel;
		
	}

//	gets/sets initiated

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
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
	
//	Method returns prints car details
	public String print() {
		return color + " " + license + " " + make + " " + model + " ";
	}
	
}
