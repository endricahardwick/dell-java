import java.util.ArrayList;
import java.util.List;

public class CarLot {

	public String name;
	public List<Vehicle> listOfVehicle;

//	Constructor empty
	public CarLot() {
	}
	
	
//	Constructor Initialized
	public CarLot(String carLotName) {
		name = carLotName;
		listOfVehicle = new ArrayList <Vehicle>();
		
	}
	
	
//	gets and sets
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Vehicle> getListOfVehicle() {
		return listOfVehicle;
	}


	public void setListOfVehicle(List<Vehicle> listOfVehicle) {
		this.listOfVehicle = listOfVehicle;
	}
	
//	Method to add a vehicle to the lot
	
	public void addVehicle(Vehicle vehicle) {
		
		listOfVehicle.add(vehicle);

		
	}
	
	
//	Method to print the inventory of the car lot, 
//	including number of vehicles and details about each vehicle
	

	public void printInventory() {
		
//		
		System.out.println();
		System.out.println("Number of vehicles in the " + name + " car lot: " + String.valueOf(listOfVehicle.size()));
//
//		System.out.println(getListOfVehicle());
//		System.out.println(listOfVehicle);
//		System.out.println(listOfVehicle.toString());
//		System.out.println(String.valueOf(listOfVehicle.toArray()));
//		
////		System.out.println(listOfVehicle.printDescription());
//
//for(int i = 0; i < listOfVehicle.size(); i++) {   
//listOfVehicle.get(i).printDescription();
//}  
////		
////		System.out.println();
//		
//		for (int i =0; i < 0; listOfVehicle.size()) {
//			listOfVehicle.get(i).printDescription();
//		}
		
		
		for (Vehicle singleVehicle : getListOfVehicle()) {
			singleVehicle.printDescription();
		}
		
		
		
	}
	
}
